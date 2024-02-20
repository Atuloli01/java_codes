class Question{
    private int quesNo;
    private String ques,option1,option2,option3,option4;
    private char answer;

    public void setQuestion(int n,String q,String a,String b,String c,String d,char ans){
        quesNo=n;
        ques=q;
        option1=a;
        option2=b;
        option3=c;
        option4=d;
        answer=ans;
    }

    public void displayQuestion(){
        System.out.println("Ques No. "+quesNo);
        System.out.println("Question. "+ques);
        System.out.println("(a). "+option1);
        System.out.println("(b). "+option2);
        System.out.println("(c). "+option3);
        System.out.println("(d). "+option4);
        System.out.println("Correct answer is: "+answer);
    }
}

public class _54Question{
    public static void main(String []args) {
        Question obj = new Question();
        obj.setQuestion(01, "Who is your favourite Teacher?", "Jitendra Chaudhry", "Mukesh Joshi", "Bhupesh Rawat", "Budhani Sir", 'b');

        obj.displayQuestion();
    }
}