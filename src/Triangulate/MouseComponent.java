package Triangulate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseComponent extends JPanel implements MouseListener {
    boolean point = false;
    boolean line = false;
    boolean triangle = false;
    boolean erase = false;

    public MouseComponent(){
        super();
        pointX = 0;
        pointY = 0;
        addMouseListener(this);
    }
    int pointX;
    int pointY;
    int lineX;
    int lineY;
    int triX;
    int triY;

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(triangle){
            g.drawLine(pointX, pointY,lineX,lineY);
            g.drawLine(triX,triY,lineX,lineY);
            g.drawLine(pointX, pointY,triX,triY);
        }
        else if(line){
            g.drawLine(pointX, pointY, lineX, lineY);
        }else if (point){
            g.drawOval(pointX -5, pointY -5,5,5);
        }else if (erase){
            erase = false;
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(!point&& !line && !triangle){
            pointX = e.getX();
            pointY = e.getY();
            triangle = false;
            point = true;
            line = false;
        }else if(point) {
            lineX = e.getX();
            lineY = e.getY();
            line = true;
            triangle = false;
            point = false;
        }else if(line) {
            triX = e.getX();
            triY = e.getY();
            point = false;
            line = false;
            triangle = true;
        }else if(triangle){
            triX = 0;
            triY = 0;
            lineX = 0;
            lineY = 0;
            pointX = 0;
            pointY = 0;
            point = false;
            line = false;
            triangle = false;
            erase = true;
        }
        repaint();
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
