/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;



import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import techquizapp.dao.PerformanceDAO;
import techquizapp.dao.QuestionDAO;
import techquizapp.pojo.Answer;
import techquizapp.pojo.AnswerStore;
import techquizapp.pojo.Exam;
import techquizapp.pojo.Performance;
import techquizapp.pojo.Question;
import techquizapp.pojo.QuestionStore;
import techquizapp.pojo.UserProfile;

/**
 *
 * @author HP
 */
public class TakeTestFrame extends javax.swing.JFrame {

    /**
     * Creates new form TakeTestFrame
     */
    private Exam exam;
    private QuestionStore qstore;
    private AnswerStore astore;  
    private int qno,pos=0;
    Color oldcolor;
    public TakeTestFrame() {
        initComponents();
       this.setLocationRelativeTo(null);  
       this.setLocationRelativeTo(null);
        lblUsername.setText("Hello "+UserProfile.getUsername());
        oldcolor=lblLogout.getForeground(); 
        lblQno.setText(lblQno.getText()+qno);
        TimerThread t=new TimerThread();
        t.start();
    }
     public TakeTestFrame(Exam exam){
        this();
        this.exam=exam;
        lblTitle.setText(exam.getLanguage().toUpperCase()+" PAPER");
        qstore=new QuestionStore();
        astore=new AnswerStore();
        qno=1;
        loadQuestions();
        showQuestion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        myPanel = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        jrOption1 = new javax.swing.JRadioButton();
        jrOption2 = new javax.swing.JRadioButton();
        jrOption3 = new javax.swing.JRadioButton();
        jrOption4 = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myPanel.setBackground(new java.awt.Color(0, 0, 0));

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 102, 0));

        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 102, 0));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 102, 0));
        lblTitle.setText("jLabel2");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techquizapp/gui/good luck2.jpg"))); // NOI18N

        lblQno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQno.setForeground(new java.awt.Color(255, 102, 0));
        lblQno.setText("Question No:");

        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        buttonGroup1.add(jrOption1);
        jrOption1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrOption1.setForeground(new java.awt.Color(255, 102, 0));
        jrOption1.setText("jRadioButton1");

        buttonGroup1.add(jrOption2);
        jrOption2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrOption2.setForeground(new java.awt.Color(255, 102, 0));
        jrOption2.setText("jRadioButton2");

        buttonGroup1.add(jrOption3);
        jrOption3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrOption3.setForeground(new java.awt.Color(255, 102, 0));
        jrOption3.setText("jRadioButton3");

        buttonGroup1.add(jrOption4);
        jrOption4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrOption4.setForeground(new java.awt.Color(255, 102, 0));
        jrOption4.setText("jRadioButton4");

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 102, 0));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 102, 0));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 102, 0));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 102, 0));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Star Test");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("End Test");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("01:00");

        javax.swing.GroupLayout myPanelLayout = new javax.swing.GroupLayout(myPanel);
        myPanel.setLayout(myPanelLayout);
        myPanelLayout.setHorizontalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout))
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(myPanelLayout.createSequentialGroup()
                                .addComponent(jrOption3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrOption4))
                            .addGroup(myPanelLayout.createSequentialGroup()
                                .addComponent(jrOption1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrOption2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time))
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevious)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        myPanelLayout.setVerticalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(lblLogout))
                        .addGap(10, 10, 10)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(1, 1, 1)
                        .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQno))
                .addGap(33, 33, 33)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOption1)
                    .addComponent(jrOption2))
                .addGap(18, 18, 18)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOption3)
                    .addComponent(jrOption4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(btnCancel)
                    .addComponent(btnDone))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginFrame loginFrame=new LoginFrame();
         loginFrame.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.white);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(oldcolor); 
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null){
        Question question=qstore.getQuestionByQno(qno);
        String correctAnswer=question.getCorrectAnswer();
       Answer newanswer=new Answer(exam.getExamId(),exam.getLanguage(),qno,
chosenAnswer,correctAnswer);
        System.out.println(newanswer);
        Answer answer=astore.getAnswerByQno(qno);
        if(answer==null)
            astore.addAnswer(newanswer);
        else{
            if(newanswer.getChosenAnswer().equals(
answer.getChosenAnswer())==false){
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
     }
        pos++;
        if(pos>=qstore.getCount())
        {
            pos=0;
        }
         qno++;         
        if(qno>qstore.getCount())
                qno=1;
        lblQno.setText("Question no:"+qno);
        showQuestion();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
                                              
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null){
        Question question=qstore.getQuestionByQno(qno);
        String correctAnswer=question.getCorrectAnswer();
        Answer newanswer=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
        System.out.println(newanswer);
        Answer answer=astore.getAnswerByQno(qno);
        if(answer==null)
            astore.addAnswer(newanswer);
        else{
            if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
     }
        pos--;
        if(pos<0)
        {
            pos=qstore.getCount()-1;
        }
      qno--;
        if(qno<=0)
        qno=qstore.getCount();
        lblQno.setText("Question no:"+qno);
        showQuestion();      
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
       String userAnswer=getUserAnswer();
        if(userAnswer!=null){
        Question question=qstore.getQuestionByQno(qno);
        String correctAnswer=question.getCorrectAnswer();
        
                
        Answer newanswer=new Answer(exam.getExamId(),exam.getLanguage(),qno,userAnswer,correctAnswer);
        System.out.println(newanswer);
        Answer answer=astore.getAnswerByQno(qno);
        if(answer==null)
            astore.addAnswer(newanswer);
        else{
            if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
        }
        int right=0,wrong=0;
        for(Question question:qstore.getAllQuestions()){
            int qno=question.getQno();
            Answer answer=astore.getAnswerByQno(qno);
            if(answer==null)
                continue;
            else
            {
                String chosenAnswer1=answer.getChosenAnswer();
                String correctAnswer=answer.getCorrectAnswer();
                if(chosenAnswer1.equals(correctAnswer))
                    ++right;
                else
                    ++wrong;
                    
            }
            
        }
        String reportCard="Total Questions:"+qstore.getCount();
        reportCard+="\nRight Answers:"+right;
        reportCard+="\nWrong Answers:"+wrong;
        reportCard+="\nUnAttempted  :"+(qstore.getCount()-(right+wrong));
        JOptionPane.showMessageDialog(null, reportCard,"Your Result!",JOptionPane.INFORMATION_MESSAGE);
 try{
        Performance performance=new Performance(exam.getExamId(),exam.getLanguage(),
        UserProfile.getUsername(),right,wrong,
        (qstore.getCount()-(right+wrong)),(double)right/qstore.getCount()*100);
            PerformanceDAO.addPerformance(performance);
            JOptionPane.showMessageDialog(null, "Your performance has been successfully added to the database"," Performance Added!",JOptionPane.INFORMATION_MESSAGE);
            ChoosePaperFrame paperFrame=new ChoosePaperFrame();
            paperFrame.setVisible(true);
            this.dispose();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }             
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        ChoosePaperFrame paperFrame=new ChoosePaperFrame();
        paperFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed
     public String getUserAnswer(){
        
        if(jrOption1.isSelected())
            return "Answer1";
        else if(jrOption2.isSelected())
            return "Answer2";
        else if(jrOption3.isSelected())
            return "Answer3";
        else if(jrOption4.isSelected())
            return "Answer4";
        else
            return null;
    }
    public void loadQuestions() {
        try{
                ArrayList<Question> questionList=QuestionDAO.getQuestionsByExamId(exam.getExamId());
                for(Question obj:questionList){
                    qstore.addQuestion(obj);
                }
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
    }
     public void showQuestion(){
        Question question=qstore.getQuestion(pos);
        buttonGroup1.clearSelection();
        txtQuestion.setText(question.getQuestion());
        jrOption1.setText(question.getAnswer1());
        jrOption2.setText(question.getAnswer2());
        jrOption3.setText(question.getAnswer3());
        jrOption4.setText(question.getAnswer4());
        Answer answer=astore.getAnswerByQno(qno);
        if(answer==null)
            return;
        String chosenAnswer=answer.getChosenAnswer();
        switch(chosenAnswer){
            case "Answer1":
                jrOption1.setSelected(true);
                break;
            case "Answer2":
                jrOption2.setSelected(true);
                break;
            case "Answer3":
                jrOption3.setSelected(true);
                break;
            case "Answer4":
                jrOption4.setSelected(true);
                break;
        }
        
    }
     class TimerThread extends Thread{
        public void run()
        {
            int min=0;
            int sec=0;
            int count=0;
           try
           {
                while(count<60)
                {
                    min=count/60;
                    sec=count%60;
                    String t="0"+String.valueOf(min)+":"+String.valueOf(sec);
                    time.setText(t);
                    Thread.sleep(1000);
                    count++;  
                }
                if(count==60)
                {
                    jrOption1.setEnabled(false);
                    jrOption2.setEnabled(false);
                    jrOption3.setEnabled(false);
                    jrOption4.setEnabled(false);
                    btnNext.setEnabled(false);
                    btnPrevious.setEnabled(false);
                    JOptionPane.showMessageDialog(null,"Time out");
                }
           } catch (InterruptedException ex) {
                Logger.getLogger(TakeTestFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrOption1;
    private javax.swing.JRadioButton jrOption2;
    private javax.swing.JRadioButton jrOption3;
    private javax.swing.JRadioButton jrOption4;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel myPanel;
    private javax.swing.JLabel time;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}

