package com.yusufensarcebeci.metallicamembers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.yusufensarcebeci.metallicamembers.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Members> membersArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        membersArrayList = new ArrayList<>();

        //Data

        Members james = new Members("James Hetfield","Lead Vocals - Rhythm Guitar","Born: August 3, 1963","James Alan Hetfield is an American musician who is the lead vocalist, rhythm guitarist, co-founder and main songwriter of heavy metal band Metallica." +
                " He is mainly known for his intricate rhythm playing, but occasionally performs lead guitar duties and solos, both live and in the studio. Hetfield co-founded Metallica in October 1981 after answering an advertisement by drummer Lars Ulrich in the Los Angeles newspaper The Recycler." +
                " Metallica has won nine Grammy Awards and released ten studio albums, three live albums, four extended plays and 24 singles.\n" +
                "In 2009, Hetfield was ranked at No. 8 in Joel McIver's book The 100 Greatest Metal Guitarists and No. 24 by " +
                "Hit Parader on their list of the 100 Greatest Metal Vocalists of All Time.",R.drawable.jameshetfield);


        Members kirk = new Members("Kirk  Hammett","Lead Guitar - Backing Vocals","Born: November 18, 1962","Kirk Lee Hammett is an American musician who has been the lead guitarist and a contributing songwriter for heavy metal band Metallica since 1983. " +
                "Before joining Metallica he formed and named the band Exodus. In 2003, Hammett was ranked 11th on Rolling Stone's list of The 100 Greatest Guitarists of All Time. " +
                "In 2009, Hammett was ranked number 15 in Joel McIver's book The 100 Greatest Metal Guitarists.",R.drawable.kirkhammett);

        Members lars = new Members("Lars Ulrich","Drum","Born: 26 December 1963","Lars Ulrich is a Danish musician best known as the drummer and co-founder of American heavy metal band Metallica. " +
                "The son and grandson respectively of tennis players Torben and Einer Ulrich, he played tennis in his youth and moved to Los Angeles at age 16 to train professionally. " +
                "However, rather than playing tennis, Ulrich began playing drums. After publishing an advertisement in The Recycler, Ulrich met James Hetfield and formed Metallica." +
                " Along with Hetfield, Ulrich has songwriting credits on almost all of the band's songs.",R.drawable.larsulrich);

        Members robert = new Members("Robert Trujillo","Bass Guitar - Backing Vocals","Born: October 23, 1964","Roberto Agustín Miguel Santiago Samuel Trujillo Veracruz is an American musician who is the bassist for heavy metal band Metallica. " +
                "He first rose to prominence as the bassist of crossover thrash band Suicidal Tendencies from 1989 to 1995, while also collaborating with Suicidal Tendencies frontman Mike Muir for funk metal supergroup Infectious Grooves. " +
                "After leaving Suicidal Tendencies, he performed with Ozzy Osbourne, Jerry Cantrell, and heavy metal band Black Label Society." +
                " Trujillo joined Metallica in 2003 and is the band's longest-serving bassist." +
                " He was inducted to the Rock and Roll Hall of Fame as a member of Metallica in 2009.",R.drawable.roberttrujillo);

        Members ron = new Members("Ron McGovney","Bass Guitar","Born: November 2, 1963","Ronald J. McGovney is an American semi-retired musician, best known as the original bass guitarist in the heavy metal band Metallica from October 1981 to December 1982.\n" +
                "Having previously played with guitarist James Hetfield in the garage band Leather Charm, McGovney was a member of Metallica during its first year of gigging and appeared on their early demos before departing late in 1982. " +
                "After a period of inactivity, he played in the thrash metal band Phantasm.",R.drawable.mcgovney);

        Members dave = new Members("Dave Mustaine","Lead Guitar - Backing Vocals","Born: September 13, 1961","David Scott Mustaine is an American musician best known as the co-founder, vocalist, guitarist, and primary songwriter of thrash metal band Megadeth. " +
                "Prior to forming Megadeth, Mustaine was the original lead guitarist of Metallica but did not appear on any of their albums.",R.drawable.davemustaine);

        Members cliff = new Members("Cliff Burton","Bass Guitar - Backing  Vocals","February 10, 1962 – September 27, 1986","Clifford Lee Burton was an American musician who was the bassist for heavy metal band Metallica from 1982 until his death in 1986. " +
                "He performed on Kill 'Em All (1983), Ride the Lightning (1984), and Master of Puppets (1986), the band's first three studio albums. " +
                "Burton also received a posthumous writing credit on ...And Justice for All (1988) for the song \"To Live Is to Die\".\n" +
                "While touring in 1986 to support Master of Puppets, Burton died following a bus crash in Sweden. Burton placed ninth in a 2011 reader poll from Rolling Stone recognizing the greatest bassists of all time. " +
                "He was posthumously inducted to the Rock and Roll Hall of Fame as a member of Metallica in 2009.",R.drawable.cliffburton);

        Members jason = new Members("Jason Newsted","Bass Guitar - Backing  Vocals","Born:  March 4, 1963","Jason Curtis Newsted is an American musician who was the bassist of American heavy metal band Metallica from 1986 to 2001. " +
                "He first performed with thrash metal band Flotsam and Jetsam from 1981 to 1986 before joining Metallica to succeed the deceased Cliff Burton. " +
                "Newsted performed on the albums ...And Justice for All (1988), Metallica (1991), Load (1996), and Reload (1997), the most album appearances among Metallica's bassists.\n" +
                "\n" +
                "",R.drawable.jasonnewsted);

        membersArrayList.add(james);
        membersArrayList.add(kirk);
        membersArrayList.add(lars);
        membersArrayList.add(robert);
        membersArrayList.add(ron);
        membersArrayList.add(dave);
        membersArrayList.add(cliff);
        membersArrayList.add(jason);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        MembersAdaptor membersAdaptor = new MembersAdaptor(membersArrayList);
        binding.recyclerView.setAdapter(membersAdaptor);

    }
}