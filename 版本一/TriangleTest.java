package myTriangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TriangleTest {
	public static void main(String[] args) {
		Window win = new Window("�ж�������",300,300);
		}
	}
class Window extends JFrame {
	static JTextField condition,AText,BText,CText,shapeText;//�����ı���
	JLabel A,B,C,shape;
	JButton judgeButton,againButton;//���ð�ť
	public Window() {}
	public Window(String s,int x,int y){ 
		JFrame frame = new JFrame(s);
	    frame.setSize(x,y);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel panel = new JPanel();
	    frame.add(panel);
	    placeComponents(panel);
	    frame.setVisible(true);
	    }
	void placeComponents(JPanel panel){
		panel.setLayout(null);
	        
	    JLabel condition = new JLabel("����������1��200��������");
	    condition.setBounds(10, 10, 200, 25);
	    panel.add(condition);
	        
	    A = new JLabel("A");
	    A.setBounds(10,40,20,25);
	    panel.add(A);


	    AText = new JTextField(20);
	    AText.setBounds(50,40,165,25);
	    panel.add(AText);

	    B = new JLabel("B");
	    B.setBounds(10,80,20,25);
	    panel.add(B);

	    BText = new JTextField(20);
	    BText.setBounds(50,80,165,25);
	    panel.add(BText);
	        
	    C = new JLabel("C");
	    C.setBounds(10,120,20,25);
	    panel.add(C);

	    CText = new JTextField(20);
	    CText.setBounds(50,120,165,25);
	    panel.add(CText);
	        
	    shape = new JLabel("��״");
	    shape.setBounds(10,160,40,25);
	    panel.add(shape);

	    shapeText = new JTextField(20);
	    shapeText.setBounds(50,160,165,25);
	    panel.add(shapeText);
	        
	    judgeButton = new JButton("�ж���״");
	    judgeButton.setBounds(10, 200, 90, 25);
	    panel.add(judgeButton);
	        
	    againButton = new JButton("��������");
	    againButton.setBounds(120, 200, 90, 25);
	    panel.add(againButton);
	    
	    judgeButton.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		String aa = AText.getText();
		        String bb = BText.getText();
		        String cc = CText.getText();
		    	boolean flag = true;
		    	if ( aa.length() <= 0 || bb.length() <= 0 || cc.length() <= 0 ) {
		    		flag = false;
		    	}
		    	for ( int i = 0; i < aa.length(); i++ ) {
		    		if ( i == 0 && aa.charAt(0) == '-' ) continue;
		    		if ( aa.charAt(i) < '0' || aa.charAt(i) > '9' ) {
		    			flag = false;
		    			break;
		    		}
		    	}
		    	for ( int i = 0; i < bb.length(); i++ ) {
		    		if ( i == 0 && bb.charAt(0) == '-' ) continue;
		    		if ( bb.charAt(i) < '0' || bb.charAt(i) > '9' ) {
		    			flag = false;
		    			break;
		    		}
		    	}
		    	for ( int i = 0; i < cc.length(); i++ ) {
		    		if ( i == 0 && cc.charAt(0) == '-' ) continue;
		    		if ( cc.charAt(i) < '0' || cc.charAt(i) > '9' ) {
		    			flag = false;
		    			break;
		    		}
		    	}
		    	if (flag == false){
		    		JOptionPane.showMessageDialog(null,"��������Ƿ�");
		    	}else {
		    		int a = Integer.parseInt(aa);
		    		int b = Integer.parseInt(bb);
		    		int c = Integer.parseInt(cc);
		    		if ( a <= 0 || b <= 0 || c <=0 || a > 200 || b > 200 || c > 200 ) {
		    			shapeText.setText("�������볬��");
		    			}
		    		else if( a + b <= c || Math.abs ( a - b ) >= c ) {
		    		    shapeText.setText("���ܹ���������");
		    		    }
		    		else {
		    		    if( a == b ) {
		    		    	if( a == c ) {
		    		    		shapeText.setText("�ȱ�������");
		    		    		}
		    		    	else {
		    		    		shapeText.setText("����������");
		    		    		}
		    		    	}
		    		    else {
		    		    	if( a == c ) {
		    		    		shapeText.setText("����������");
		    		    		}
		    		    	else {
		    		    		if( b == c ) {
		    		    			shapeText.setText("����������");
		    				    }
		    		    		else {
		    		    			shapeText.setText("һ��������");
		    		    			}
		    		    		}
		    		    	}
		    		    }
		    		}
		    	}
	    });
	    againButton.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e) {
	    		AText.setText(null);
		        BText.setText(null);
		    	CText.setText(null);
		    	shapeText.setText(null);
		    	}
	    	});
	    }
	}




