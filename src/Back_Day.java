import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;

public class Back_Day extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Back_Day frame = new Back_Day();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Back_Day() {
		setTitle("Queen's Cafe \uD83D\uDC96");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Image img=new ImageIcon(this.getClass().getResource("/00IPLR68C6436F30E3D7E6px.jpg")).getImage();
		Image img1=new ImageIcon(this.getClass().getResource("/00IPLR68C6436F30E3D7E6px.jpg")).getImage();
		
		JButton btnNewButton = new JButton("Order Your's One \u25B6");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		btnNewButton.setBounds(509, 306, 159, 44);
		contentPane.add(btnNewButton);
		
			
			JLabel lblNewLabel = new JLabel("User ");
			lblNewLabel.setBounds(-266, 0, 944, 388);
			contentPane.add(lblNewLabel);
			lblNewLabel.setIcon(new ImageIcon(img));
			lblNewLabel.setIcon(new ImageIcon(img1));
			
			JLabel lblNewLabel_1 = new JLabel("New label");
			Image img2=new ImageIcon(this.getClass().getResource("/Screenshot%20(9).png")).getImage();
			lblNewLabel.setIcon(new ImageIcon(img2));
			lblNewLabel_1.setBounds(509, 306, 159, 44);
			contentPane.add(lblNewLabel_1);
		
		
	}
}
