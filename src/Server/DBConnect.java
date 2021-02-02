package Server;

import javax.swing.*;
import java.sql.*;


@SuppressWarnings("serial")
public class DBConnect extends JFrame {
	// JDBC 드라이버
	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	private JButton btnConnect;
	private JPasswordField pwText;
	private JTextField idText, ipAddrText, portNumText, dbNameText;
	
	
	public DBConnect() {
		//******** setting
		// 창 이름
		super("DB 연결");		// setTitle("DB 연결");
		// 창 크기(너비, 높이)
		setSize(300, 400);
		// 창 보이기
		setVisible(true);
		// 창이 뜰 위치 결정(가로, 세로)
		setLocation(500, 300);
		// 창 크기 고정
		setResizable(false);
		// 종료 이벤트(종료 시 메모리에서도 사라지도록)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// panel
		JPanel panel = new JPanel();
		dbConnectPanel(panel);
		
		// add
		add(panel);
		
	}
	
	public void dbConnectPanel(JPanel p) {
		p.setLayout(null);	// 배치관리자 없이 직접 배치
		
		// Label
		JLabel idLabel = new JLabel("아이디");
		idLabel.setBounds(20, 20, 80, 25);
		p.add(idLabel);
		
		JLabel pwLabel = new JLabel("비밀번호");
		pwLabel.setBounds(20, 50, 80, 25);
		p.add(pwLabel);
		
		JLabel ipLabel = new JLabel("IP Address");
		ipLabel.setBounds(20, 80, 80, 25);
		p.add(ipLabel);
		
		JLabel portLabel = new JLabel("포트");
		portLabel.setBounds(20, 110, 80, 25);
		p.add(portLabel);
		
		JLabel dbNameLabel = new JLabel("DB명");
		dbNameLabel.setBounds(20, 140, 80, 25);
		p.add(dbNameLabel);
		
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
		
		dbNameText = new JTextField(20);
		dbNameText.setBounds(100, 140, 160, 25);
		p.add(dbNameText);
		
		// button
		btnConnect = new JButton("연결");
		btnConnect.setBounds(40, 180, 200, 25);
		p.add(btnConnect);
		btnConnect.addActionListener(event -> {
			try {
				// DB 접속주소
				String DB_URL = "jdbc:mysql://" + ipAddrText.getText() + ":" + portNumText.getText() + "/" + dbNameText.getText() + "?useSSL=false";
				System.out.println(DB_URL);	// test
				
				// JDBC 드라이버 로딩
				Class.forName(JDBC_DRIVER);
				
				// MySQL 서버 연결
				DriverManager.getConnection(DB_URL, idText.getText(), "toor");
				
			} catch (Exception e) {
				System.out.println("DB 연결 오류!");
			}

		});
		
		// test값
		idText.setText("root");
		pwText.setText("");
		ipAddrText.setText("localhost");
		portNumText.setText("3306");
		dbNameText.setText("pcroom_db");
	}
}