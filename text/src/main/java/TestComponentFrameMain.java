import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/05.
 */
public class TestComponentFrameMain {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            JFrame tcfm = new TextComponentFrame();
            tcfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            tcfm.setVisible(true);
            tcfm.setSize(400, 300);
        });
    }
}
