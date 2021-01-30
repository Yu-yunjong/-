package Server;

import javax.swing.*;


@SuppressWarnings("serial")
public class DBConnect extends JFrame {
	private JButton btnConnect;
	private JPasswordField pwText;
	private JTextField idText, ipAddrText, portNumText;
	
	public DBConnect() {
		//******** setting
		// â �̸�
		super("DB ����");		// setTitle("DB ����");
		// â ũ��(�ʺ�, ����)
		setSize(300, 400);
		// â ���̱�
		setVisible(true);
		// â�� �� ��ġ ����(����, ����)
		setLocation(500, 300);
		// â ũ�� ����
		setResizable(false);
		// ���� �̺�Ʈ(���� �� �޸𸮿����� ���������)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// panel
		JPanel panel = new JPanel();
		dbConnectPanel(panel);
		
		// add
		add(panel);
		
	}
	
	public void dbConnectPanel(JPanel p) {
		p.setLayout(null);	// ��ġ������ ���� ���� ��ġ
		
		// Label
		JLabel idLabel = new JLabel("���̵�");
		idLabel.setBounds(20, 20, 80, 25);
		p.add(idLabel);
		
		JLabel pwLabel = new JLabel("��й�ȣ");
		pwLabel.setBounds(20, 50, 80, 25);
		p.add(pwLabel);
		
		JLabel ipLabel = new JLabel("IP Address");
		ipLabel.setBounds(20, 80, 80, 25);
		p.add(ipLabel);
		
		JLabel portLabel = new JLabel("��Ʈ");
		portLabel.setBounds(20, 110, 80, 25);
		p.add(portLabel);
		
		// textField
		idText = new JTextField(20);
		idText.setBounds(100, 20, 160, 25);
		p.add(idText);
		
		pwText = new JPasswordField(20);
		pwText.setBounds(100, 50, 160, 25);
		p.add(pwText);
		
		ipAddrText = new JTextField(15);
		ipAddrText.setBounds(100, 80, 160, 25);
		p.add(ipAddrText);
		
		portNumText = new JTextField(5);
		portNumText.setBounds(100, 110, 160, 25);
		p.add(portNumText);
		
		// button
		btnConnect = new JButton("����");
		btnConnect.setBounds(40, 150, 200, 25);
		p.add(btnConnect);
		
		// test��
		idText.setText("root");
		pwText.setText("");
		ipAddrText.setText("localhost");
		portNumText.setText("3306");
	}
}