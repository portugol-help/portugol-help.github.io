/*     */ package Editor.help;
/*     */ 
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.IOException;
/*     */ import java.net.URL;
/*     */ import java.util.Vector;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JEditorPane;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.event.HyperlinkEvent;
/*     */ import javax.swing.event.HyperlinkEvent.EventType;
/*     */ import javax.swing.event.HyperlinkListener;
/*     */ 
/*     */ public class WWWHelpText
/*     */   extends JPanel
/*     */   implements HyperlinkListener
/*     */ {
/*  25 */   public static String VERSION = "ver:1.5\tdata:20-11-2005 \t(c)António Manso";
/*     */   
/*     */   private JButton btHome;
/*     */   
/*     */   private JButton btPrevious;
/*     */   private JButton btNext;
/*     */   private JPanel jPanel1;
/*     */   private JEditorPane txtHelp;
/*     */   private JLabel txtUrl;
/*     */   private String home;
/*     */   Vector urlNext;
/*     */   Vector urlPrevious;
/*     */   
/*     */   public WWWHelpText(String file)
/*     */   {
/*  40 */     initComponents();
/*  41 */     this.urlNext = new Vector();
/*  42 */     this.urlPrevious = new Vector();
/*  43 */     setPage(file);
/*  44 */     this.home = file;
/*     */   }
/*     */   
/*     */   public void setPage(String file)
/*     */   {
/*     */     try {
/*  50 */       this.txtUrl.setText(ClassLoader.getSystemResource(file).toString());
/*  51 */       this.txtHelp.setPage(ClassLoader.getSystemResource(file));
/*     */     } catch (IOException ioe) {
/*  53 */       this.txtHelp.setText("ERROR: " + ioe);
/*     */     }
/*     */   }
/*     */   
/*     */   public void setURLPage(String file) {
/*  58 */     try { this.txtHelp.setPage(new URL(file));
/*  59 */       this.txtUrl.setText(file);
/*     */     } catch (IOException ioe) {
/*  61 */       this.txtHelp.setText("ERROR: " + ioe);
/*     */     }
/*     */   }
/*     */   
/*     */   public void hyperlinkUpdate(HyperlinkEvent event) {
/*  66 */     if (event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
/*  67 */       this.urlPrevious.add(this.txtUrl.getText());
/*  68 */       setURLPage(event.getURL().toString());
/*     */     }
/*     */   }
/*     */   
/*     */   private void initComponents()
/*     */   {
/*  74 */     this.jPanel1 = new JPanel();
/*  75 */     this.btHome = new JButton();
/*  76 */     this.btPrevious = new JButton();
/*  77 */     this.btNext = new JButton();
/*  78 */     this.txtUrl = new JLabel();
/*  79 */     this.txtHelp = new JEditorPane();
/*     */     
/*  81 */     this.txtHelp = new JEditorPane();
/*  82 */     this.txtHelp.setEditable(false);
/*  83 */     this.txtHelp.addHyperlinkListener(this);
/*  84 */     JScrollPane scrollPane = new JScrollPane(this.txtHelp);
/*  85 */     add(scrollPane);
/*     */     
/*  87 */     setLayout(new BorderLayout());
/*  88 */     this.jPanel1.setLayout(new FlowLayout(0));
/*  89 */     this.btPrevious.setIcon(new ImageIcon(getClass().getResource("/Icons/www/previous.png")));
/*  90 */     this.btPrevious.setPreferredSize(new Dimension(50, 24));
/*     */     
/*  92 */     this.btPrevious.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  94 */         WWWHelpText.this.btPreviousAction(evt);
/*     */       }
/*  96 */     });
/*  97 */     this.jPanel1.add(this.btPrevious);
/*     */     
/*     */ 
/*     */ 
/* 101 */     this.btHome.setIcon(new ImageIcon(getClass().getResource("/Icons/www/home.png")));
/* 102 */     this.btHome.setPreferredSize(new Dimension(100, 24));
/* 103 */     this.btHome.setText("Inicio");
/* 104 */     this.btHome.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 106 */         WWWHelpText.this.btHomeAction(evt);
/*     */       }
/* 108 */     });
/* 109 */     this.jPanel1.add(this.btHome);
/*     */     
/* 111 */     this.btNext.setIcon(new ImageIcon(getClass().getResource("/Icons/www/next.png")));
/* 112 */     this.btNext.setPreferredSize(new Dimension(50, 24));
/*     */     
/* 114 */     this.btNext.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 116 */         WWWHelpText.this.btNextAction(evt);
/*     */       }
/* 118 */     });
/* 119 */     this.jPanel1.add(this.btNext);
/*     */     
/*     */ 
/* 122 */     this.jPanel1.add(this.txtUrl);
/* 123 */     add(this.jPanel1, "North");
/*     */     
/* 125 */     add(this.txtHelp, "Center");
/*     */   }
/*     */   
/* 128 */   private void btHomeAction(ActionEvent evt) { setPage(this.home); }
/*     */   
/*     */   private void btNextAction(ActionEvent evt)
/*     */   {
/* 132 */     if (!this.urlNext.isEmpty())
/*     */     {
/* 134 */       this.urlPrevious.add(this.txtUrl.getText());
/*     */       
/* 136 */       String link = (String)this.urlNext.remove(this.urlNext.size() - 1);
/*     */       
/* 138 */       setURLPage(link);
/*     */     }
/*     */   }
/*     */   
/*     */   private void btPreviousAction(ActionEvent evt)
/*     */   {
/* 144 */     if (!this.urlPrevious.isEmpty())
/*     */     {
/* 146 */       this.urlNext.add(this.txtUrl.getText());
/* 147 */       String link = (String)this.urlPrevious.remove(this.urlPrevious.size() - 1);
/* 148 */       setURLPage(link);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\USER\Desktop\portugol\Portugol.jar!\Editor\help\WWWHelpText.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */