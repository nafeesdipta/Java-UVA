package lab1;

import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;
import com.jogamp.opengl.util.Animator;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Circle implements GLEventListener{
	private static double theta = 0;
	static int count=1;
        static int c=70;static int cc=50;static int ccc=30;static int cccc=10;static int c4=20;
	static int c5=69;static int c6=70;static int c7=71;static int c8=73;static int c9=75;
        double xc=0.45/2.5;double yc=0.73/2.5;
	double xc1=.75/2.5;double yc1=.41/2.5;
        double xc2=0.83/2.5;double yc2=.18/2.5;
        double xc3=0.88/2.5;double yc3=-.15/2.5;
        double xc4=0.87/2.5;double yc4=.008/2.5;
        double xc5=-0.08/2.5;double yc5=.78/2.5;
        double xc6=-0.43/2.5;double yc6=.53/2.5;
       double xc7=-0.62/2.5;double yc7=.13/2.5;
       double xc8=-0.53/2.5;double yc8=-.3/2.5;
       double xc9=-0.2/2.5;double yc9=-.61/2.5;
	public static Animator animator;
	static GL2 gl;
	static GLProfile profile = GLProfile.get(GLProfile.GL2);
	static GLCapabilities capabilities = new GLCapabilities(profile);
	// The canvas 
	static GLCanvas glcanvas = new GLCanvas(capabilities);
	public Circle(GL2 gl)
	{
		Circle.gl=gl;
	}

	public static void main(String[] args) {
		//getting the capabilities object of GL2 profile	      
		Circle l = new Circle(gl);
		//creating frame
		glcanvas.addGLEventListener(l);
		glcanvas.setSize(600, 600);
		final JFrame frame = new JFrame ("Drawing Circle");
		//adding canvas to frame
		frame.getContentPane().add(glcanvas);
		frame.setSize(frame.getContentPane().getPreferredSize());
		frame.setVisible(true);
		animator = new Animator(glcanvas);
		animator.start();

	}
	public void display(GLAutoDrawable drawable) {
		gl = drawable.getGL().getGL2();
		double xt=0;double yt=0;double xt1=0;double yt1=0;double xt2=0;double yt2=0;
                double xt3=0;double yt3=0;double xt4=0;double yt4=0;
                double xt5=0;double yt5=0;
                double xt6=0;double yt6=0;
                double xt7=0;double yt7=0;
                double xt8=0;double yt8=0;
                double xt9=0;double yt9=0;
                gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
        		gl.glBegin (GL2.GL_LINES);//static field
	theta-=.175;
		xt=(xc)*Math.cos(theta)-(yc)*Math.sin(theta);
		yt=(xc)*Math.sin(theta)+(yc)*Math.cos(theta);
		//
        xt1=(xc1)*Math.cos(theta)-(yc1)*Math.sin(theta);
		yt1=(xc1)*Math.sin(theta)+(yc1)*Math.cos(theta);
                //
        xt2=(xc2)*Math.cos(theta)-(yc2)*Math.sin(theta);
		yt2=(xc2)*Math.sin(theta)+(yc2)*Math.cos(theta);
                //
        xt3=(xc3)*Math.cos(theta)-(yc3)*Math.sin(theta);
		yt3=(xc3)*Math.sin(theta)+(yc3)*Math.cos(theta);
		//
		xt4=(xc4)*Math.cos(theta)-(yc4)*Math.sin(theta);
		yt4=(xc4)*Math.sin(theta)+(yc4)*Math.cos(theta);
                //
                xt5=(xc5)*Math.cos(theta)-(yc5)*Math.sin(theta);
		yt5=(xc5)*Math.sin(theta)+(yc5)*Math.cos(theta);
                //
                xt6=(xc6)*Math.cos(theta)-(yc6)*Math.sin(theta);
		yt6=(xc6)*Math.sin(theta)+(yc6)*Math.cos(theta);
            //
                xt7=(xc7)*Math.cos(theta)-(yc7)*Math.sin(theta);
		yt7=(xc7)*Math.sin(theta)+(yc7)*Math.cos(theta);
                //
                xt8=(xc8)*Math.cos(theta)-(yc8)*Math.sin(theta);
		yt8=(xc8)*Math.sin(theta)+(yc8)*Math.cos(theta);
                //
                 xt9=(xc9)*Math.cos(theta)-(yc9)*Math.sin(theta);
		yt9=(xc9)*Math.sin(theta)+(yc9)*Math.cos(theta);
                   gl.glColor3f(0.35f, 0.35f, .35f);
                  drawCircle2(c,xt,yt);//70,50,30,10
                  gl.glColor3f(0.3f, 0.3f, .3f);
                          
                 drawCircle2(cc,xt1,yt1);
                           gl.glColor3f(0.4f, 0.4f, .4f);
                 drawCircle2(ccc,xt2,yt2);
                           gl.glColor3f(0.45f, 0.45f, .45f);
                 drawCircle2(cccc,xt3,yt3);
                            gl.glColor3f(0.5f, 0.5f, .5f);
                 drawCircle2(c4,xt4,yt4);
                           gl.glColor3f(0.55f, 0.55f, .55f);
                drawCircle2(c5,xt5,yt5);
                           gl.glColor3f(0.6f, 0.6f, .6f);
                drawCircle2(c6,xt6,yt6);
                  gl.glColor3f(0.65f, 0.65f, .65f);
                drawCircle2(c7,xt7,yt7);
                gl.glColor3f(0.72f, 0.72f, .72f);
                drawCircle2(c8,xt8,yt8);
                gl.glColor3f(0.79f, 0.79f, .79f);
                drawCircle2(c9,xt9,yt9);
		gl.glEnd();
	}
	
	void drawCircle2(double r,double xcen,double ycen)//(0,r)
	{
		double x=0;double y=r;
		draw8way2(x,y,xcen,ycen);
		double d=5-4*r;
		while(x<y)
		{
			if(d<0){//E
				d+=(2*x+3)*4;
				x++;
			}
			else{//SE
				d+=((2*x)-(2*y)+5)*4;
				x++;y--;
			}
			draw8way2(x,y,xcen,ycen);
		}
	}
	
	public static void drawPixel(double x,double y)
	{
		gl.glVertex2d(x,y);
	}

	public static void draw8way2(double x,double y,double xcen,double ycen)
	{
		x=x/1000;y=y/1000;
		drawPixel(xcen+x, ycen+y);
		drawPixel(xcen-x, ycen+y);
		drawPixel(xcen+x, ycen-y);
		drawPixel(xcen-x, ycen-y);		
		drawPixel(xcen+y, ycen+x);
		drawPixel(xcen-y, ycen+x);
		drawPixel(xcen+y, ycen-x);
		drawPixel(xcen-y, ycen-x);
		
	}
	public void dispose(GLAutoDrawable arg0) {
		//method body
	}


	public void init(GLAutoDrawable drawable) {
		drawable.getGL().setSwapInterval(1);
	} 
	public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
		// method body
	}



}
