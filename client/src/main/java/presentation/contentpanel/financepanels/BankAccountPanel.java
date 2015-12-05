package presentation.contentpanel.financepanels;

import presentation.commoncontainer.MyButton;
import presentation.commoncontainer.MyDefaultTableModel;
import presentation.commoncontainer.MyTable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Harry on 2015/12/4.
 */
public class BankAccountPanel extends JPanel implements ActionListener{
    private Frame parent;
    private MyDefaultTableModel defaultTableModel;
    private MyTable table;
    private MyButton addbt=new MyButton("新增账户");
    private MyButton deletebt=new MyButton("删除账户");

    public BankAccountPanel(Frame par){
        this.parent=par;
        init();
        refresh();
    }

    private void init(){
        String [] names ={"帐号","金额"};
        defaultTableModel=new MyDefaultTableModel(names,0);
        table=new MyTable(defaultTableModel);

        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc= new GridBagConstraints();
        gbc.insets=new Insets(10,10,10,10);
        gbc.weightx=1.0;
        gbc.weighty=1.0;

        gbc.gridx=gbc.gridy=0;
        gbc.gridwidth=3;
        this.add(new JScrollPane(table),gbc);
        gbc.gridwidth=1;
        gbc.gridy++;
        this.add(addbt, gbc);
        gbc.gridx++;
        this.add(deletebt,gbc);
    }

    public void refresh(){

    }

    public void actionPerformed(ActionEvent e) {

    }
}
