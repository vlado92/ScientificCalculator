import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;

@SuppressWarnings("serial")
public class RightClickMenu extends JPopupMenu
{
    public Clipboard clipboard;

    public JMenuItem copy;
    public JMenuItem delete;
    public JMenuItem selectAll;

    private JTextComponent jTextComponent;

    public RightClickMenu()
    {
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        
        add(new JSeparator());

        copy = new JMenuItem("Copy");
        copy.setEnabled(false);
        copy.setAccelerator(KeyStroke.getKeyStroke("control C"));
        copy.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                jTextComponent.copy();
            }
        });

        add(copy);


        delete = new JMenuItem("Delete");
        delete.setEnabled(false);
        delete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
        delete.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                jTextComponent.replaceSelection("");
            }
        });

        add(delete);

        add(new JSeparator());

        selectAll = new JMenuItem("Select All");
        selectAll.setEnabled(false);
        selectAll.setAccelerator(KeyStroke.getKeyStroke("control A"));
        selectAll.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                jTextComponent.selectAll();
            }
        });

        add(selectAll);
    }

    public void add(JTextComponent jTextComponent)
    {
        jTextComponent.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseReleased(MouseEvent releasedEvent)
            {
                if (releasedEvent.getButton() == MouseEvent.BUTTON3)
                {
                    processClick(releasedEvent);
                }
            }
        });
    }

    private void processClick(MouseEvent event)
    {
        jTextComponent = (JTextComponent) event.getSource();

        boolean enableCopy = false;
        boolean enableDelete = false;
        boolean enableSelectAll = false;

        String selectedText = jTextComponent.getSelectedText();
        String text = jTextComponent.getText();

        if (text != null)
        {
            if (text.length() > 0)
            {
                enableSelectAll = true;
            }
        }

        if (selectedText != null)
        {
            if (selectedText.length() > 0)
            {
                enableCopy = true;
                enableDelete = true;
            }
        }

        copy.setEnabled(enableCopy);
        delete.setEnabled(enableDelete);
        selectAll.setEnabled(enableSelectAll);

        show(jTextComponent, event.getX(), event.getY());
    }
}
