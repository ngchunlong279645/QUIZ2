package quiz2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class quiz2 {

	private JFrame frmWaterCalculator;
	private JTextField num;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quiz2 window = new quiz2();
					window.frmWaterCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public quiz2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWaterCalculator = new JFrame();
		frmWaterCalculator.getContentPane().setBackground(new Color(255, 239, 213));
		frmWaterCalculator.getContentPane().setForeground(Color.BLACK);
		frmWaterCalculator.setTitle("Water Calculator");
		frmWaterCalculator.setBounds(100, 100, 278, 169);
		frmWaterCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWaterCalculator.getContentPane().setLayout(null);
		
		num = new JTextField();
		num.setBackground(new Color(211, 211, 211));
		num.setBounds(141, 55, 86, 20);
		frmWaterCalculator.getContentPane().add(num);
		num.setColumns(10);
		
		JLabel lblHowMuchWater = new JLabel("How much water should i drink ?");
		lblHowMuchWater.setFont(new Font("Tekton Pro Ext", Font.BOLD, 13));
		lblHowMuchWater.setBounds(10, 24, 252, 14);
		frmWaterCalculator.getContentPane().add(lblHowMuchWater);
		
		JLabel lblMyWeightpounds = new JLabel("My weight (KG):");
		lblMyWeightpounds.setFont(new Font("Tekton Pro Ext", Font.BOLD, 12));
		lblMyWeightpounds.setBounds(10, 59, 145, 14);
		frmWaterCalculator.getContentPane().add(lblMyWeightpounds);
		
		JButton btnNewButton = new JButton("Tell Me");
		btnNewButton.setBackground(new Color(175, 238, 238));
		btnNewButton.setFont(new Font("Tekton Pro Ext", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double weight,ounces,litre;
			try {
				weight=Double.parseDouble(num.getText());
				litre=weight* 0.033;
				
				ounces=litre/0.0295735;
				JOptionPane.showMessageDialog(null, "Hey Buddy! You should drink "+String.format("%.2f", litre)+"L ("+String.format("%.2f", ounces)+" ounces) of water a day~");
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID NUMBER!");
			}
			}
		});
		btnNewButton.setBounds(138, 96, 89, 23);
		frmWaterCalculator.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(221, 160, 221));
		btnReset.setFont(new Font("Tekton Pro Ext", Font.BOLD, 12));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num.setText("");
			}
		});
		btnReset.setBounds(39, 96, 89, 23);
		frmWaterCalculator.getContentPane().add(btnReset);
	}
}
