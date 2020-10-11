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
		
		JLabel lblNewLabel_3 = new JLabel("food items for an evening event.Stay Home-Stay Safe");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 349, 406, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("and we do not accept food orders for dinner and if you are looking ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 324, 406, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("which is nearest to the delivery location, We will deliver lunch orders around 12 - 1.30 ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 299, 406, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel caption2 = new JLabel("Foods delivery is limited to below areas/cities All food items delivering from reputed Our restaurant,");
		caption2.setFont(new Font("Tahoma", Font.BOLD, 11));
		caption2.setForeground(Color.WHITE);
		caption2.setBounds(10, 274, 638, 14);
		contentPane.add(caption2);
		
		JLabel caption = new JLabel("Now you can order your favourite food from Queen's Cafe.");
		caption.setFont(new Font("Tahoma", Font.BOLD, 11));
		caption.setForeground(Color.WHITE);
		caption.setBounds(10, 249, 312, 14);
		contentPane.add(caption);
		
		JButton btnNewButton = new JButton("Go to Menu ");
		btnNewButton.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 17));
		btnNewButton.setBounds(492, 316, 176, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(-213, 0, 891, 377);
		contentPane.add(lblNewLabel);
		
		
		
		
	}
}
