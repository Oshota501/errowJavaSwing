package errow;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Errow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=88,121
	 */

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Errow frame = new Errow();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Errow(String hyt ,String title) {
        // デフォルトのToolkitインスタンスを取得
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        
        // 画面サイズをDimensionオブジェクトとして取得
        Dimension screenSize = toolkit.getScreenSize();
        
        // 幅と高さをピクセル単位で取得
        int width = screenSize.width;
        int height = screenSize.height;
		
		double wf = (width-300)*Math.random();
		double hf = (height-120)*Math.random();
		int w = (int)wf ;
		int h = (int)hf ;
		
		setBounds(w,h, 450, 220);
		
		
		this.setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		Icon icon = new ImageIcon(Errow.class.getResource("/errow.png"));
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(icon);
		lblNewLabel_1.setBounds(24, 31, 69, 71);
		contentPane.add(lblNewLabel_1);
		JLabel lblNewLabel = new JLabel(hyt);
		lblNewLabel.setBounds(120, 6, 324, 140);
		contentPane.add(lblNewLabel);
		
		
		//キャンセルbtn
		JButton btn = new JButton();
		btn.setBounds(270,140,100,20);
		btn.setText("Close");
		contentPane.add(btn);
		btn.addActionListener(e->{
			this.setVisible(false);
			new Errow("<html>Close errow : It could not close this window.<br><br>Check your brain and computer ,java sorcecode.</html>","Window errow");
		});
		//report
		JButton btn1 = new JButton();
		btn1.setBounds(150,140,100,20);
		btn1.setText("Report");
		contentPane.add(btn1);
		btn1.addActionListener(e->{
			this.setVisible(false);
			new Errow("<html>Report errow : It could not send errow code .<br><br>Check your internet conect .</html>","Report errow");
			for(int i = 0 ; i < 15*Math.random() ; i ++)new Errow("<html>Could not load text data.<br><br>Check your computer register.</html>","Loading errow");
		});
		this.setVisible(true);
	}
}
