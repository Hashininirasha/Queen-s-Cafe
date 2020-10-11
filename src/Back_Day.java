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
		
		JButton btnNewButton = new JButton("Go to Menu ");
		btnNewButton.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 17));
		btnNewButton.setBounds(459, 290, 176, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(-213, 0, 891, 377);
		contentPane.add(lblNewLabel);
		
		
		
		
	}
}
