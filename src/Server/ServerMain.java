package Server;

import javax.swing.*;


@SuppressWarnings("serial")
public class ServerMain extends JFrame {
	public static void main(String[] args) {
		DBConnect db = new DBConnect();
		//ServerMain main = new ServerMain();
	}
	
	public ServerMain() {
		//******** setting
		// â �̸�
		super("PC�� ���� ���α׷�(����)");
		// â ũ��(�ʺ�, ����)
		setSize(1500, 1000);
		// â ���̱�
		setVisible(true);
		// â�� �� ��ġ ����(����, ����)
		//setLocation(500, 300);
		// â ũ�� ����
		setResizable(false);
		// ���� �̺�Ʈ(���� �� �޸𸮿����� ���������)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// panel
		// 1: ����, 2: ��ǰ ����, 3: ȸ�� ����, 4: ���� ����, 5: PC ����
		JPanel panel1 = new JPanel();
		mainPanel(panel1);
		
		JPanel panel2 = new JPanel();
		productPanel(panel2);
		
		JPanel panel3 = new JPanel();
		memberPanel(panel3);
		
		JPanel panel4 = new JPanel();
		salesPanel(panel4);
		
		JPanel panel5 = new JPanel();
		pcPanel(panel5);
		
		// add
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		
		// Tab
		JTabbedPane tab = new JTabbedPane();
		tab.setBounds(50, 50, 200, 200);
		tab.add("����", panel1);
		tab.add("��ǰ ����", panel2);
		tab.add("ȸ�� ����", panel3);
		tab.add("���� ����", panel4);
		tab.add("PC ����", panel5);
		add(tab);
		
		
	}
	// ����
	public void mainPanel(JPanel p) {
		
	}
	
	// ��ǰ ����
	public void productPanel(JPanel p) {
		
	}
	
	// ȸ�� ����
	public void memberPanel(JPanel p) {
		
	}
	
	// ���� ����
	public void salesPanel(JPanel p) {
		
	}
	
	// PC ����
	public void pcPanel(JPanel p) {
		
	}
}