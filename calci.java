package com.example.cal;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends Activity implements OnClickListener {    
Button nine,eig,sev,six,fiv,four,thr,two,one,zero,dot,plus,mins,div,mul,eq,cl;
EditText et;
    String s = "0";
int result = 0;
char lO = ' ';
    @Override
protected void onCreate(Bundle savedInstanceState)    
{       super.onCreate(savedInstanceState);        
setContentView(R.layout.activity_main);        
nine=(Button)findViewById(R.id.button1);
eig=(Button)findViewById(R.id.button2);
sev=(Button)findViewById(R.id.button3);
six=(Button)findViewById(R.id.button4);
fiv=(Button)findViewById(R.id.button5); 
four=(Button)findViewById(R.id.button6);
thr=(Button)findViewById(R.id.button7);
two=(Button)findViewById(R.id.button8);
one=(Button)findViewById(R.id.button9);
zero=(Button)findViewById(R.id.button10);
dot=(Button)findViewById(R.id.button11);
plus=(Button)findViewById(R.id.button13);
mins=(Button)findViewById(R.id.button14);
div=(Button)findViewById(R.id.button16);
mul=(Button)findViewById(R.id.button15);
eq=(Button)findViewById(R.id.button12);
cl=(Button)findViewById(R.id.button17);
et=(EditText)findViewById(R.id.editText1);
nine.setOnClickListener(this);
eig.setOnClickListener(this);
sev.setOnClickListener(this);
six.setOnClickListener(this);
fiv.setOnClickListener(this);
four.setOnClickListener(this);
thr.setOnClickListener(this);
two.setOnClickListener(this);
one.setOnClickListener(this);
dot.setOnClickListener(this);
plus.setOnClickListener(this);
mins.setOnClickListener(this);
div.setOnClickListener(this);
mul.setOnClickListener(this);
eq.setOnClickListener(this);
cl.setOnClickListener(this);
et.setOnClickListener(this);      }
    @Override
public void onClick(View v) 
{switch(v.getId())
{ case R.id.button1:
case R.id.button2:
case R.id.button3:
case R.id.button4:
case R.id.button5:
case R.id.button6:
case R.id.button7:
case R.id.button8:
case R.id.button9:
case R.id.button10:
            String inDigit = ((Button) v).getText().toString();
if (s.equals("0"))
        {  s= inDigit;   }
else
        {  s+=inDigit;   }
et.setText(s);
if(lO == '=')
            {  result=0;
               lO =' ';  }
break;
case R.id.button13:
compute();
lO = '+';
break;
case R.id.button14:
compute();
lO = '-';
break;
case R.id.button16:
compute();
lO = '/';
break;
case R.id.button15:
compute();
lO = '*';
break;
case R.id.button12:
compute();
lO = '=';
break;
case R.id.button17:
result = 0;
            s = "0";
lO = ' ';
et.setText("0");
break;
        } } 
private void compute()
{  int inNum = Integer.parseInt(s);
        s = "0";
if (lO == ' ')
        {   result = inNum;  }
else if (lO == '+')
        {  result += inNum;  }
else if (lO == '-')
        {  result -= inNum; }
else if (lO == '*')
        { result *= inNum;  }
else if (lO == '/')
        {  result /= inNum;  }
else if (lO == '=')
        {       }        et.setText(String.valueOf(result));    } }


