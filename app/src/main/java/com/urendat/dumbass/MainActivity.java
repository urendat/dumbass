package com.urendat.dumbass;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// https://developer.android.com/training/implementing-navigation/lateral.html


public class MainActivity extends AppCompatActivity {

  /**
   * The {@link android.support.v4.view.PagerAdapter} that will provide
   * fragments for each of the sections. We use a
   * {@link FragmentPagerAdapter} derivative, which will keep every
   * loaded fragment in memory. If this becomes too memory intensive, it
   * may be best to switch to a
   * {@link android.support.v4.app.FragmentStatePagerAdapter}.
   */
  private SectionsPagerAdapter mSectionsPagerAdapter;

  /**
   * The {@link ViewPager} that will host the section contents.
   */
  private ViewPager mViewPager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    // Create the adapter that will return a fragment for each of the three
    // primary sections of the activity.
    mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

    // Set up the ViewPager with the sections adapter.
    mViewPager = (ViewPager) findViewById(R.id.container);
    mViewPager.setAdapter(mSectionsPagerAdapter);

//    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//    fab.setOnClickListener(new View.OnClickListener() {
//      @Override
//      public void onClick(View view) {
//        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//            .setAction("Action", null).show();
//      }
//    });

  }


  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }

  /**
   * A placeholder fragment containing a simple view.
   */
  public static class PlaceholderFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public PlaceholderFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceholderFragment newInstance(int sectionNumber) {
      PlaceholderFragment fragment = new PlaceholderFragment();
      Bundle args = new Bundle();
      args.putInt(ARG_SECTION_NUMBER, sectionNumber);
      fragment.setArguments(args);
      return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View rootView = inflater.inflate(R.layout.fragment_main, container, false);
      TextView textView = (TextView) rootView.findViewById(R.id.section_content);  // section_label
//      textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

      Typeface tf = Typeface.create("", Typeface.BOLD);
      textView.setTypeface(tf, 1);
      textView.setTextSize(16.0F);

      int pageNumber = getArguments().getInt(ARG_SECTION_NUMBER);
      StringBuilder lies = new StringBuilder();
      switch (pageNumber) {
        case 1:
          lies.append("LIES:\n")
            .append("He knows the smartest people\n")
            .append(" - cabinet is full of big donors and sycophants\n")
            .append("   Perry knows nothing about DOE, and wanted to eliminate it\n")
            .append("   De Vos knows nothing about education policy, hates public education\n")
            .append("   Carson knows nothing about housing OR urban development\n")
            .append("   Bannon wanted a war with Islam - proposed \"Documentary\" \"Destroying the Great Satan\"\n")
            .append("5 million illegal voters cost him popular vote\n")
            .append("Crime rate is the highest ever\n")
            .append("Not going to cut Medicare or Medicaid\n")
            .append("Promised a specific plan to defeat ISIS in 30 days\n")
            .append("US is the cleanest nation in the world\n")
            .append("Obama wa not born in the US\n")
            .append("Obama wiretapped his phone\n")
            .append("Ted Cruz's dad killed Kennedy\n")
            .append("Muslims were dancing in New Jersey on 9/11\n")
            .append("He would make China convince North Korea to give up nuclear weapons\n")
            .append("94 million Americans are out of the work force\n")
            .append("   This includes retirees, stay-at-home parents, college students\n")
            .append("US is the most taxed nation in the world\n")
            .append("   not even close - it is among the least taxed nations\n")
            .append("Scott Pruitt claims 50,000 new coal jobs since 4th quarter 2016, 7,000 in May alone\n")
            .append("   BLS data shows 1,300 total, 400 in May\n")
            .append("Clinton sold Uranium to the Russians\n")
            .append("   All 9 members of Committee on Foreign Investment approved sale\n")
            .append("   Clinton had no personal involvement\n")
            .append("   Donor to Clinton Foundation already sold all shares of Uranium One\n")
            .append("   Clinton was not Secretary of State at the time of donation\n")
            .append("Protesters are being paid\n")
            .append("Unemployment is as high as 42%\n")
            .append("Job growth actually SLOWED in 2018\n")
          ;
          break;
        case 2:
          lies.append("WHITE HOUSE CHAOS: \n")
            .append("6 high-level appointees lasted less than 6 months\n")
            .append("   FBI Director, National Security Adviser, Comm. Director, Press Sec., Chief of Staff, Chief Strategist\n")
            .append("More than 40% turnover rate\n")
            .append("  Michael Flynn - National Security Adviser - forced out over conversations with Russian ambassador, then lied to Pence\n")
            .append("  James Comey - FBI Director - fired because of the Russia investigation\n")
            .append("  Mike Dubke - Communication Director - resigned for \"personal reasons\"\n")
            .append("  Sean Spicer - Press Secretary - resigned\n")
            .append("  Reince Priebus - Chief of Staff - fired after 6 months\n")
            .append("  Anthony Scaramucci - The Mooch - Communication Director - lasted 10 days\n")
            .append("  Steve Bannon - Chief Political Strategist - fired after Kelly took over\n")
            .append("  Tom Price - HHS sec. had to resign after using private jet 24 times, costing $300k\n")
            .append("  Omarosa Newman - what the fuck did she do anyway?\n")
            .append("  Brenda Fitzgerald = Director of CDC - resigned over financial ties to tobacco and health care companies\n")
            .append("  Rob Porter - Staff Secretary - resigned after spousal abuse details emerged\n")
            .append("  Hope Hicks - Communication Director - resigned after lying to Mueller investigation\n")
            .append("  Gary Cohn - Chief Economic Adviser - resigns after Trump announces steel and aluminum tariffs\n")
            .append("  Rex Tillerson - Sec. of State - fired after first year, right after criticizing Russians\n")
            .append("    - Trump challenged him to an IQ test after being called a \"fucking moron\"\n")
            .append("  John McEntee - Personal Aide - escorted from White House for criminal financial activity\n")
            .append("  Andrew McCabe - Assoc. FBI Director - fired two days before retirement because Trump didn't like is investigations\n")
            .append("  Jared Kushner - Mr. do-it-all - lost security clearance after lying multiple times on application\n")
            .append("Russian Scandal\n")
            .append("  Congress votes for Russian sanctions (98-2, 419-3), Trump rejects them\n")
            .append("  Manafort, Kushner, Trump Jr. met with Russian gov. reps specifically to gain access to dirt on Hillary\n")
            .append("  Kushner proposed secret comm. channel using Russian system inside Russian embassy\n")
            .append("Drain the swamp\n")
            .append("  Trump hired more than 187 former lobbyists into senior WH positions\n")
            .append("  Issues record # of ethics rules exemptions for lobbyists hired by administration\n")
            .append("Had affair with Stormy Daniels fight after Milania gave birth\n")
            .append("  Paid $130 to keep it quiet\n")
          ;
          break;
        case 3:
          lies.append("FAILED PROMISES: \n")
            .append("Build That Wall, and Mexico will pay for it\n")
            .append("   Wall will cost $21 billion\n")
            .append("   2018 budget requested $18 billion from taxpayers\n")
            .append("   Mar-a-Lago gets Labor Dept. permission to hire 70 foreign workers\n")
            .append("Drain The Swamp\n")
            .append("Lock Her Up\n")
            .append("Repeal Obamacare and replace it with something \"fantastic\"\n")
            .append("Reduce deficit\n")
            .append("Tax Reform\n")
            .append("Ban Muslims\n")
            .append("   There have been no terrorist deaths by anyone from these countries\n")
            .append("Renegotiate trade deals\n")
            .append("Mark China as a currency manipulator\n")
            .append("Cut entitlements\n")
            .append("Address income inequality\n")
            .append("Destroy ISIS with his secret plan\n")
            .append("Reauthorize torture (waterboarding)\n")
            .append("Kill Iran deal\n")
            .append("Make NATO pay\n")
            .append("Place tariffs on imports from China and Mexico\n")
            .append("Move US Embassy to Jerusalem\n")
          ;
          break;
        case 4:
          lies.append("STUPIDITY: \n")
            .append("Exit Paris agreement for reasons that are not part of the agreement\n")
            .append("Cancel TPP (allowing China to dominate region)\n")
            .append("Kill climate change regulations\n")
            .append("Appoint traitors to important jobs\n")
            .append("   Manafort was campaign chair - indicted for \"Conspiracy Against United States\"\n")
            .append("   Flynn was National Security Advisor - had to resign and is under investigation\n")
            .append("Appoint Kushner to lead several policy efforts\n")
            .append("   Middle East peace\n")
            .append("   Trade with China\n")
            .append("   Solving opioid epidemic\n")
            .append("   Reforming criminal justice system\n")
            .append("   Re-inventing government\n")
            .append("Attack judges who rule against him\n")
            .append("Obamacare repeal would have taken health care from 24 million\n")
            .append("   and given $285 billion tax break to top 2%\n")
            .append("Appoint Ivanka as a key adviser without ANY qualifications\n")
            .append("Bombed Syria after repeatedly tweeting for Obama to stop\n")
            .append("Leaks and Fake News are the problem, not Russia collusion\n")
            .append("Unemployment numbers used to be fake, now they are real\n")
            .append("Calls it \"treason\" when Congress doesn't clap for him\n")
            .append("At his first cabinet meeting, he demanded loyalty and praise from each member\n")
            .append("Compromised Israeli intel sources to the Russians at White House meeting\n")
            .append("   Including Israeli spy undercover in ISIS territory\n")
            .append("Thinks women who have abortions should go to prison\n")
            .append("Sent more troops to Afghanistan after campaigning that we should leave\n")
            .append("Fired FBI director Comey after asking him to halt Russia investigation\n")
            .append("In first 6 months, he held: 1 press conference, 5 campaign rallies\n")
            .append("   Obama had 11 press conferences in first year\n")
            .append("Oh my god, the golfing! \n")
            .append("   Blew through Secret Service annual budget in 7 months\n")
            .append("   Including $73K for golf cart at Trump properties\n")
            .append("Texas hurricane relief - 23 of 24 in H of R, and both Senators (Cruz and Cornyn, voted against Sandy relief\n")
            .append("Attack Gold Star family during campaign\n")
          ;
          break;
        case 5:
          lies.append("QUOTES: \n")
            .append("We'll be tired of winning\n")
            .append("Climate change is a Chinese hoax\n")
            .append("Obama golfs too much\n")
            .append("Mexicans are rapists and murderers\n")
            .append("Blacks live in hell\n")
            .append("I know words, I have the best words\n")
            .append("Win the War on Christmas\n")
            .append("One of the greatest electoral college landslides in history\n")
            .append("Graham-Cassidy (Obamacare repeal) failed because of a Senator in the hospital\n")
            .append("Declared Federal judge could not be fair to Trump because he is Mexican\n")
            .append("Many sides are to blame for Charlottesville violence\n")
            .append("He needs to \"get the facts\" before condemning white supremacists\n")
            .append("You will be shocked by the speed at which bi-lateral trade agreements are reached\n")
            .append("   Withdraw from TPP, no new trade deal at all\n")
            .append("I'm not going to have time to play golf\n")
            .append("Tweets \"Back to work\" after New Years, then plays golf 7 straight days.\n")

          ;
          break;
        case 6:
          lies.append("OBAMA: \n")
            .append("Saved the economy from Great Recession\n")
            .append("Cut deficit by 2/3\n")
            .append("Created 14 million jobs\n")
            .append("Unemployment rate dropped from 10% to 4.6%\n")
            .append("Killed bin Laden\n")
            .append("Record stock market\n")
            .append("20 million Americans got health care\n")
            .append("Led establishment of global climate agreement\n")
            .append("Ended 2 wars in Afghanistan and Iraq\n")
            .append("Saved the US auto industry\n")
            .append("Stopped Iran's progress toward nuclear weapons\n")
            .append("Establish the Consumer Financial Protection Bureau\n")
            .append(" - returned $12 billion to 27 million scam victims\n")
            .append("Gas < $2 a gallon\n")
          ;
          break;
        default:
          lies.append("Tab count exceeded.\n");
      }

      textView.setText(lies.toString());
      return rootView;
    }
  }

  /**
   * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
   * one of the sections/tabs/pages.
   */
  public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
      super(fm);
    }

    @Override
    public Fragment getItem(int position) {
      // getItem is called to instantiate the fragment for the given page.
      // Return a PlaceholderFragment (defined as a static inner class below).
      return PlaceholderFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
      // Show 6 total pages.
      return 6;
    }
  }
}
