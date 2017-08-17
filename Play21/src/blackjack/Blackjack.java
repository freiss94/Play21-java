package blackjack;
import javax.swing.JOptionPane;
import java.util.Random;

public class Blackjack 
{
	public static void main(String[] args)
	{
		int i;
		String contin="Y";
		deck card[] = new deck[52];
		for (i = 0; i<=51; i++)
		{
		    card[i] = new deck();
		}	
		
	game_play value= new game_play();
	value.load(card);
	value.printdeck(card);
	
	String output,player_name;
	int games = 0,res = 2;
	output = "Please enter your name";
	player_name = JOptionPane.showInputDialog(null,output,"Name entry",JOptionPane.QUESTION_MESSAGE);
	while(contin.equalsIgnoreCase("Y"))
	{	//the loop for the player to continue is posted outside of the dealing class
		dealing player1 = new dealing(player_name,games,res);
		player1.welcome();
		player1.start_playing(card);
		games++;
		contin = JOptionPane.showInputDialog(null,"Play again?\n\n>Y\n>N","Next Round",JOptionPane.QUESTION_MESSAGE);
	}
   	System.exit(0);
	}
}

class game_play
{
 int i;

 void load(deck card[])
	{
	card[0].card_name="TWO";
	card[0].card_type="heart";
	card[0].card_value=2;
	card[0].dealt=false;
	card[1].card_name="THREE";
	card[1].card_type="heart";
	card[1].card_value=3;
	card[1].dealt=false;
	card[2].card_name="FOUR";
	card[2].card_type="heart";
	card[2].card_value=4;
	card[2].dealt=false;
	card[3].card_name="FIVE";
	card[3].card_type="heart";
	card[3].card_value=5;
	card[3].dealt=false;
	card[4].card_name="SIX";
	card[4].card_type="heart";
	card[4].card_value=6;
	card[4].dealt=false;
	card[5].card_name="SEVEN";
	card[5].card_type="heart";
	card[5].card_value=7;
	card[5].dealt=false;
	card[6].card_name="EIGHT";
	card[6].card_type="heart";
	card[6].card_value=8;
	card[6].dealt=false;
	card[7].card_name="NINE";
	card[7].card_type="heart";
	card[7].card_value=9;
	card[7].dealt=false;
	card[8].card_name="TEN";
	card[8].card_type="heart";
	card[8].card_value=10;
	card[8].dealt=false;
	card[9].card_name="ACE";
	card[9].card_type="heart";
	card[9].card_value=1;
	card[9].dealt=false;
	card[10].card_name="JACK";
	card[10].card_type="heart";
	card[10].card_value=10;
	card[10].dealt=false;
	card[11].card_name="QUEEN";
	card[11].card_type="heart";
	card[11].card_value=10;
	card[11].dealt=false;
	card[12].card_name="KING";
	card[12].card_type="heart";
	card[12].card_value=10;
	card[12].dealt=false;
		
	card[13].card_name="TWO";
	card[13].card_type="diamond";
	card[13].card_value=2;
	card[13].dealt=false;
	card[14].card_name="THREE";
	card[14].card_type="diamond";
	card[14].card_value=3;
	card[14].dealt=false;
	card[15].card_name="FOUR";
	card[15].card_type="diamond";
	card[15].card_value=4;
	card[15].dealt=false;
	card[16].card_name="FIVE";
	card[16].card_type="diamond";
	card[16].card_value=5;
	card[16].dealt=false;
	card[17].card_name="SIX";
	card[17].card_type="diamond";
	card[17].card_value=6;
	card[17].dealt=false;
	card[18].card_name="SEVEN";
	card[18].card_type="diamond";
	card[18].card_value=7;
	card[18].dealt=false;
	card[19].card_name="EIGHT";
	card[19].card_type="diamond";
	card[19].card_value=8;
	card[19].dealt=false;
	card[20].card_name="NINE";
	card[20].card_type="diamond";
	card[20].card_value=9;
	card[20].dealt=false;
	card[21].card_name="TEN";
	card[21].card_type="diamond";
	card[21].card_value=10;
	card[21].dealt=false;
	card[22].card_name="ACE";
	card[22].card_type="diamond";
	card[22].card_value=1;
	card[22].dealt=false;
	card[23].card_name="JACK";
	card[23].card_type="diamond";
	card[23].card_value=10;
	card[23].dealt=false;
	card[24].card_name="QUEEN";
	card[24].card_type="diamond";
	card[24].card_value=10;
	card[24].dealt=false;
	card[25].card_name="KING";
	card[25].card_type="diamond";
	card[25].card_value=10;
	card[25].dealt=false;
		
	card[26].card_name="TWO";
	card[26].card_type="spade";
	card[26].card_value=2;
	card[26].dealt=false;
	card[27].card_name="THREE";
	card[27].card_type="spade";
	card[27].card_value=3;
	card[27].dealt=false;
	card[28].card_name="FOUR";
	card[28].card_type="spade";
	card[28].card_value=4;
	card[28].dealt=false;
	card[29].card_name="FIVE";
	card[29].card_type="spade";
	card[29].card_value=5;
	card[29].dealt=false;
	card[30].card_name="SIX";
	card[30].card_type="spade";
	card[30].card_value=6;
	card[30].dealt=false;
	card[31].card_name="SEVEN";
	card[31].card_type="spade";
	card[31].card_value=7;
	card[31].dealt=false;
	card[32].card_name="EIGHT";
	card[32].card_type="spade";
	card[32].card_value=8;
	card[32].dealt=false;
	card[33].card_name="NINE";
	card[33].card_type="spade";
	card[33].card_value=9;
	card[33].dealt=false;
	card[34].card_name="TEN";
	card[34].card_type="spade";
	card[34].card_value=10;
	card[34].dealt=false;
	card[35].card_name="ACE";
	card[35].card_type="spade";
	card[35].card_value=1;
	card[35].dealt=false;
	card[36].card_name="JACK";
	card[36].card_type="spade";
	card[36].card_value=10;
	card[36].dealt=false;
	card[37].card_name="QUEEN";
	card[37].card_type="spade";
	card[37].card_value=10;
	card[37].dealt=false;
	card[38].card_name="KING";
	card[38].card_type="spade";
	card[38].card_value=10;
	card[38].dealt=false;
		
	card[39].card_name="TWO";
	card[39].card_type="club";
	card[39].card_value=2;
	card[39].dealt=false;
	card[40].card_name="THREE";
	card[40].card_type="club";
	card[40].card_value=3;
	card[40].dealt=false;
	card[41].card_name="FOUR";
	card[41].card_type="club";
	card[41].card_value=4;
	card[41].dealt=false;
	card[42].card_name="FIVE";
	card[42].card_type="club";
	card[42].card_value=5;
	card[42].dealt=false;
	card[43].card_name="SIX";
	card[43].card_type="club";
	card[43].card_value=6;
	card[43].dealt=false;
	card[44].card_name="SEVEN";
	card[44].card_type="club";
	card[44].card_value=7;
	card[44].dealt=false;
	card[45].card_name="EIGHT";
	card[45].card_type="club";
	card[45].card_value=8;
	card[45].dealt=false;
	card[46].card_name="NINE";
	card[46].card_type="club";
	card[46].card_value=9;
	card[46].dealt=false;
	card[47].card_name="TEN";
	card[47].card_type="club";
	card[47].card_value=10;
	card[47].dealt=false;
	card[48].card_name="ACE";
	card[48].card_type="club";
	card[48].card_value=1;
	card[48].dealt=false;
	card[49].card_name="JACK";
	card[49].card_type="club";
	card[49].card_value=10;
	card[49].dealt=false;
	card[50].card_name="QUEEN";
	card[50].card_type="club";
	card[50].card_value=10;
	card[50].dealt=false;
	card[51].card_name="KING";
	card[51].card_type="club";
	card[51].card_value=10;
	card[51].dealt=false;
	}
 
	void printdeck(deck card[])
	{
		 //loop to print all cards
	       for (i=0; i<=51; ++i)
	        {
	    	if((i==13)||(i==26)||(i==39))
	    		System.out.println();
              System.out.println(card[i].card_name+" "+card[i].card_type+" " +card[i].card_value
            		  +" " +card[i].dealt);
	        }//for loop
	}
}

class deck
{
	String card_name;
    String card_type;
    int card_value;
    boolean dealt;
}

class dealing
{
	String output, ans, name_player, start_screen,
		   screen1,screen2;
	int i, wins,cpuw,igames,results, play_card,
		p_total=0,d_total=0;
	boolean bust = false,d_bust = false;
	double win_percent;
	
	dealing(String player_name,int games, int res)
	{
		name_player = player_name;
		igames=games;
		results=res;
	}
	
	void welcome()
	{
		String congrats="Let's go!";
		if(results==1){wins++;}
		if(results==0){cpuw++;}
		if(igames>0)
		{	//the player will receive a congrats remark here based on his or her performance
			win_percent = wins/igames*100;
			if(win_percent>=60)
			{congrats = "WOW, You're great!";}
			else
			{congrats = "WOW, You suck!";}
		}
		
		output = "READY TO PLAY BLACKJACK?\n"
				+"=========================\n"
				+"Player 1: "+name_player+"\n"
				+"The current score is: "+wins+" wins for the player. \n"
				+"There are: "+cpuw+" wins for the computer. \n"
				+"==========================\n"
				+"The player has won "+win_percent+" of games.\n"
				+congrats+"\n"
				+"> Would you like to continue? Y/N?";
		start_screen = JOptionPane.showInputDialog(null,output,
				"LET'S PLAY BLACKJACK",JOptionPane.YES_NO_CANCEL_OPTION);
	}
	
	void start_playing(deck card[])
	{
		int 	j=0,k=0,	// we use 'j' and 'k' to make it easier to set the card values
				card_flag=0,deck_position,
				new_play_card=0,new_deal_card=0;
		
		String draw_ans="draw";
				//we generate cards within the method each time we draw one.
				
				deal_card(card);
				j=play_card;
				card_flag=0;	// and the card_flag is set to zero AFTER EACH LOOP
				
				deal_card(card);
				k=play_card;
				card_flag=0;
				
		output = "Your first card is a "+card[j].card_name+" of "+card[j].card_type+
				"s with the value of "+card[j].card_value+"\n"
				+"========================================"+"\n"
				+"On the other side of the table, you see that the dealer \nhas drawn his first card face up...."+"\n"
				+"The dealer has the card "+card[k].card_name+" of "+card[k].card_type+"s with the value of "
				+card[k].card_value;
		
		screen1 = JOptionPane.showInputDialog(null,output,"FIRST DRAW",JOptionPane.QUESTION_MESSAGE);
		p_total=card[j].card_value;	//we first add the total here, and set it equal to the card value
		d_total=card[k].card_value;
		
			deal_card(card);
			j=play_card;
			card_flag=0;
			
			deal_card(card);
			k=play_card;
			card_flag=0;
			
		output ="Your second card is a "+card[j].card_name+" of "+card[j].card_type
				+"s with the value of "+card[j].card_value;
		screen1 = JOptionPane.showInputDialog(null,output,"SECOND DRAW",JOptionPane.QUESTION_MESSAGE);
		p_total=card[j].card_value+p_total;	//next, we finally add the second card value onto the previous card.
		d_total=card[k].card_value+d_total;
		output = "Your current total is "+p_total+" will you draw, or stay?"+"\n"+">DRAW"+"\n"+">STAY";
		draw_ans = JOptionPane.showInputDialog(null,output,"DRAW AGAIN?",JOptionPane.QUESTION_MESSAGE);
			while(draw_ans.equalsIgnoreCase("DRAW"))
			{	//this is the 'draw card' loop and will continue every time the user enters 'draw'
				
				deal_card(card);
				j=play_card;
				card_flag=0;
				p_total=card[j].card_value+p_total;
				output = "Your second card is a "+card[j].card_name+" of "+card[j].card_type
						+"s with the value of "+card[j].card_value+"\n"+"Your current total is "+p_total;
				screen1 = JOptionPane.showInputDialog(null,output,"NEW CARD",JOptionPane.QUESTION_MESSAGE);
					if(p_total>=21)
					{	//the loop will immediately end if the player has busted
						screen1 = JOptionPane.showInputDialog(null,"You have gone over 21, you busted!",
								"BUSTED",JOptionPane.QUESTION_MESSAGE);
						bust = true;
					}
						if(bust==true)
						{
							draw_ans="XXX";
						}
					else
					{
						output = "Your current total is "+p_total+" will you draw, or stay?"+"\n"+">DRAW"+"\n"+">STAY";
						draw_ans = JOptionPane.showInputDialog(null,output,"DRAW AGAIN?",JOptionPane.QUESTION_MESSAGE);
					}
			}
			
			//this loop will check if the dealer has a total of less than 17, if he does, then he draws another card.
			while(d_total<=17)
			{
				deal_card(card);
				k=play_card;
				card_flag=0;
				d_total=card[k].card_value+d_total;
			}//if the dealer busts when he draws cards, then his bust value will become true.
			if(d_total>21){d_bust = true;}
		
		win_check();
	}
	
	int deal_card(deck card[]) {
		
		int card_flag=0,deck_position;
		while(card_flag!=1)
		{
			play_card = (int)Math.round(Math.random()*51)+0;
			deck_position = (int)Math.round(play_card);
			if(!card[deck_position].dealt)
			{
				card[deck_position].dealt=true;
				card_flag=1;
			}
		}
		return play_card;
	}
	
	void win_check() {
		
		output = "Here's the score...\n"+
				"The player's total: "+p_total+"\n"+
				"The dealer's total: "+d_total;
		screen1 = JOptionPane.showInputDialog(null,output,"SCORES",JOptionPane.QUESTION_MESSAGE);
		
		//below is where the separate win conditions are
		if(bust==false&&d_bust==false)
		{	//this loop is the default, if neither busts, it simply checks for the higher score
			if(p_total>d_total)
			{output = "You scored higher than the dealer, you won!"; results=1;}
			if(d_total>p_total)
			{output = "You have failed! The dealer's score was better!";results=0;}
		}
		
		//the loop below is only active if the dealer busts, and you will receive a win
		if(d_bust==true){output = "The dealer busted. You win!";results=1;}
		if(bust==true)
		{	//here, if the player busts, then the cpu will only receive a win if they did not bust.
			output = "You busted! How unfortunate!";
			if(d_bust==false){results=0;}
		}
		
		//finally, there is a tie if both players have the same cards, or they both bust.
		if(p_total==d_total){output = "It's a tie, nobody wins!";results=2;}
		if(bust==true&&d_bust==true){output = "You both busted. You idiots!";results=2;}
		screen2 = JOptionPane.showInputDialog(null,output,"RESULTS",JOptionPane.QUESTION_MESSAGE);
	}
	
}