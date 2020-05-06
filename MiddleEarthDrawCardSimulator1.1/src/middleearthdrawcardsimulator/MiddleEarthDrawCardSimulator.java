/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package middleearthdrawcardsimulator;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

/**
 *
 * @author Mneme
 */
public class MiddleEarthDrawCardSimulator extends JFrame{
 // 定义组件
    JTextArea jta = null;// 多行文本框
    JScrollPane jsp = null;
    JPanel jp1 = null;// 面板
    JComboBox jcb = null;// 下拉框组件
    JButton jb1 = null;
    JButton jb2 = null;

   /* public static void main(String[] args) {
        // TODO Auto-generated method stub
        MiddleEarthDrawCardSimulator d5 = new MiddleEarthDrawCardSimulator();

    }
*/
    // 构造函数
    public MiddleEarthDrawCardSimulator() {
        // 多行文本框会根据情况自己调节大小
        jta = new JTextArea();
        jsp = new JScrollPane(jta);
        jp1 = new JPanel();
        String j2[] = { "高星池", "友情池" };
        jcb = new JComboBox(j2);
        // 文本框最好设置初值
        jb1 = new JButton("抽一次");
        jb2 = new JButton("抽十次");
        // 布局管理
        // this.setLayout(new GridLayout(1, 1));
        // 添加
        jp1.add(jcb);
        jp1.add(jb1);
        jp1.add(jb2);
        // 多行文本框是放在这里(JFrame)的!!!
        // 因为上面又添加可以滚动的功能,这里传入jsp，而不是jta
        this.add(jsp);
        // 下面这里就需要定位处理
        this.add(jp1, BorderLayout.SOUTH);

        // 设置窗体属性,z这里很厉害!!
        jb1.addActionListener((ActionEvent arg0) -> {
            if("友情池".equals(jcb.getSelectedItem().toString()))
            {
                jta.setText(DrawCard.FPullOnce());
            }
            else{
                jta.setText(DrawCard.SPullOnce());
            }
        });
        jb2.addActionListener((ActionEvent arg0) -> {
            if("友情池".equals(jcb.getSelectedItem().toString()))
            {
                jta.setText(DrawCard.FPullTenTimes());
            }
            else{
                jta.setText(DrawCard.FPullTenTimes());
            }
        });
        this.setSize(600, 400);
        this.setTitle("middleearthdrawcardsimulator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
    
}