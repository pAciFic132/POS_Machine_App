import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import java.awt.*;
 
public class TapMenu extends JTabbedPane
{
    // 텝과 레이블 변수 선언
    private JTabbedPane tab;
    private Storage j2;
    private  Employee j5;
    private Menu j4;
    private Vip j3;
    
    public TapMenu()
    {
    		
       
        // 텝 생성과 위치 선정
        tab = new JTabbedPane(JTabbedPane.TOP);
        
        // 패널 생성
        JPanel one = new JPanel();
        
        JPanel two = new JPanel();
        j2 = new Storage();
        JPanel three=new JPanel();
        j3= new Vip();
        JPanel four=new JPanel();
        j4 = new Menu();
        
        JPanel five=new JPanel();
        j5 = new Employee();
        
        // 패널 추가
        two.add(j2);
        four.add(j4);
        five.add(j5);
        three.add(j3);
        // 탭 명칭과 컴포넌트 추가
        tab.addTab("테이블 ", one);
        tab.addTab("창고 ", two);
        tab.addTab("회원 ", three);
        tab.addTab("메뉴 ", four);
        tab.addTab("직원 ", five);
        tab.setSize(400,400);
   
        
        //getContentPane().add(tab, BorderLayout.CENTER);
       
        //setVisible(true);
    }

	public JTabbedPane getTab() {
		return tab;
	}

	public void setTab(JTabbedPane tab) {
		this.tab = tab;
	}
    
   
}