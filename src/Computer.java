import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.TextField;

public class Computer implements ActionListener  {

	private JFrame frame;
	private JTextField tfInput;
	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnResult;
	private JLabel lbResult;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Computer window = new Computer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Computer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 237, 195);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC785\uB825 :");
		lblNewLabel.setBounds(12, 61, 57, 15);
		frame.getContentPane().add(lblNewLabel);

		tfInput = new JTextField("텍스트입력..", 20);
		tfInput.setBounds(81, 58, 126, 21);
		frame.getContentPane().add(tfInput);
		tfInput.setColumns(10);
		tfInput.addActionListener(this);

		btnAdd = new JButton("+");
		btnAdd.setBounds(12, 100, 57, 47);
		frame.getContentPane().add(btnAdd);
		btnAdd.addActionListener(this);

		btnSub = new JButton("-");
		btnSub.setBounds(81, 100, 57, 47);
		frame.getContentPane().add(btnSub);
		btnSub.addActionListener(this);

		btnResult = new JButton("=");
		btnResult.setBounds(150, 100, 57, 47);
		frame.getContentPane().add(btnResult);
		btnResult.addActionListener(this);

		JLabel lblNewLabel_1 = new JLabel("\uACB0\uACFC :");
		lblNewLabel_1.setBounds(12, 26, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);

		lbResult = new JLabel("New label");
		lbResult.setBounds(81, 26, 126, 15);
		frame.getContentPane().add(lbResult);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAdd) {
			System.out.println("Add!");
		}else if(e.getSource() == btnSub) {
			System.out.println("Sub!");
		}else if(e.getSource() == btnResult) {
			System.out.println("Result!");
		}else if(e.getSource() == tfInput) {
			System.out.println(tfInput.getText()+"\n");
		}else {
			System.out.println("action!");
		}
	}


}
