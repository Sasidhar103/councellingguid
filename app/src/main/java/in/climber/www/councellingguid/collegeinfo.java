package in.climber.www.councellingguid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class collegeinfo extends AppCompatActivity {

    Toolbar mToolbar;
    TextView flag;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collegeinfo);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        flag = (TextView) findViewById(R.id.textView2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mToolbar.setTitle(bundle.getString("CollegeName"));
            if (mToolbar.getTitle().toString().equalsIgnoreCase("NIT_JALANDHAR")) {
                flag.setText("YEAR OF ESTABLISHMENT:1987\n " +
                "\n" +
                        "TRANSPORT:\n" +
                        "Nearest Airport : Sri Guru Ram Dass Jee International Airport, Amritsar\n" +
                        "Distance from Airport : 80km\n" +
                        "Nearest Railway Station : Jalandhar City Railway Station\n" +
                        "Distance from Railway Station : 13km\n" +
                        "Next Nearest Railway Station : Jalandhar Cantt Railway Station\n" +
                        "Distance from Railway Station : 20km\n" +
                        "\n" +
                        "RANKING:\n" +
                        "By NIRF in 2018 : 74\n" +
                        "By NIRF in 2017 : 101-150\n" +
                        "By Edu Rand in 2015 : 42\n" +
                        "By The Week in 2015 : 41\n" +
                        "\n" +
                        "FEE STRUCTURE:\n" +
                        "Caution Money (One Time, Refundable)->₹5,000\n" +
                        "One Time Fees->₹1,100\n" +
                        "Tuition Fee (per Semester)->₹62,500\n" +
                        "Other fees (per Semester)->₹6,950\n" +
                        "Annual Fee->₹500\n" +
                        "Total->₹76,050\n" +
                        "\n" +
                        "WEBSITE:http://www.nitj.ac.in/");
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("NIT_BHOPAL")) {
                flag.setText("YEAR OF ESTABLISHMENT:1960\n" +
                        "\n" +
                        "TRANSPORT:\n" +
                        "Nearest Airport : Raja Bhoj Airport, Bhopal\n" +
                        "Distance from Airport : 16km\n" +
                        "Nearest Railway Station : Bhopal Habibganj Railway Station\n" +
                        "Distance from Railway Station : 5km\n" +
                        "Next Nearest Railway Station : Bhopal Railway Station\n" +
                        "Distance from Railway Station : 8km\n" +
                        "\n" +
                        "RANKING:\n" +
                        "By NIRF in 2018 : 55\n" +
                        "By NIRF in 2017 : 61\n" +
                        "By Edu Rand in 2015 : 29\n" +
                        "By The Week in 2015 : 33\n" +
                        "\n" +
                        "FEES STRUCTURE:\n" +
                        "Caution Money (One Time, Refundable)-->₹5,000\n" +
                        "One Time Fees\t                      ₹5,940\n" +
                        "Tuition Fee (per Semester)\t      ₹62,500\n" +
                        "Other Fees (per Semester)\t      ₹6,160\n" +
                        "                                      --------\n" +
                        "Total\t                              ₹79,600\n" +
                        "                                      --------\n" +
                        "WEBSITE:http://ww.manit.ac.in");
            } else if(mToolbar.getTitle().toString().equalsIgnoreCase("NIT_JAIPUR")) {
                flag.setText("YEAR OF ESTABLISHMENT:1963\n" +
                        "\n" +
                        "TRANSPORT:\n" +
                        "Nearest Airport : Sanganer Airport, Jaipur\n" +
                        "Distance from Airport : 6km\n" +
                        "Nearest Railway Station : Gandhinagar Jaipur Railway Station\n" +
                        "Distance from Railway Station : 3.7km\n" +
                        "Main Railway Station : Jaipur Railway Station\n" +
                        "Distance from Railway Station : 11.5km\n" +
                        "\n" +
                        "RANKING:\n" +
                        "By NIRF in 2018 : 52\n" +
                        "By NIRF in 2017 : 70\n" +
                        "By Edu Rand in 2015 : 20\n" +
                        "By The Week in 2015 : 36\n" +
                        "\n" +
                        "FEES STRUCTURE:\n" +
                        "Caution Money (One Time, Refundable)-->₹15,000\n" +
                        "One Time Fees\t                       ₹3,300\n" +
                        "Tuition Fee (per Semester)\t       ₹62,500\n" +
                        "Other fees (per Semester)\t       ₹16,800\n" +
                        "Annual Fees\t                        ₹400\n" +
                        "-------------------------------        ---------\n" +
                        "Total\t                                ₹98,000\n" +
                        "                                       ---------\n" +
                        "WEBSITE:http://www.mnit.ac.in/");
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("NIT_CALICUT")) {
                flag.setText("YEAR OF ESTABLISHMENT:1961\n" +
                        "\n" +
                        "TRANSPORT:\n" +
                        "Nearest Airport : Calicut International Airport, Karipur\n" +
                        "Distance from Airport : 45km\n" +
                        "Nearest Railway Station : Kozhikode (Calicut)  Railway Station\n" +
                        "Distance from Railway Station : 22km\n" +
                        "\n" +
                        "RANKINGS:\n" +
                        "By NIRF in 2018 : 50\n" +
                        "By NIRF in 2017 : 44\n" +
                        "By India Today in 2016 : 13\n" +
                        "By Edu Rand in 2015 : 35\n" +
                        "By The Week in 2015 : 25\n" +
                        "\n" +
                        "FEES STRUCTURE:\n" +
                        "Caution Money (One Time, Refundable)-->₹1,500\n" +
                        "One Time Fees\t                       ₹4,000\n" +
                        "Tuition Fee (per Semester)\t       ₹62,500\n" +
                        "Other fees (per Semester)\t       ₹3,900\n" +
                        "Annual Fees\t                       ₹2,450\n" +
                        "---------------------------------      -------\n" +
                        "Total\t                               ₹74,350\n" +
                        "                                      --------\n" +
                        "\n" +
                        "WEBSITE:http://www.nitc.ac.in/\n");
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("NIT_AGARTALA")) {
                flag.setText("YEAR OF ESTABLISHMENT::1965\n" +
                        "\n" +
                        "TRANSPORT::\n" +
                        "Nearest Airport : Singerbhill Airport, Agartala\n" +
                        "Distance from Airport : 27km\n" +
                        "Nearest Railway Station : Jirania Railway Station, Tripura\n" +
                        "Distance from Railway Station : 2km\n" +
                        "\n" +
                        "RANKINGS::\n" +
                        "By NIRF in 2018 : 92\n" +
                        "By NIRF in 2017 : 101-150\n" +
                        "By Edu Rand in 2015 : 80\n" +
                        "\n" +
                        "FEES STRUCTURE::\n" +
                        "Caution Money (One Time, Refundable)-->₹5,000\n" +
                        "One Time Fees\t                       ₹1,500\n" +
                        "Inst. Dev. Fee (1st and 2nd sem only)  ₹5,000\n" +
                        "Tuition Fee (per Semester)\t       ₹62,500\n" +
                        "Other fees (per Semester)\t       ₹2,500\n" +
                        "Annual Fees\t                       ₹1,200\n" +
                        "-----------------------------         --------\n" +
                        "Total\t                              ₹77,700\n" +
                        "                                      --------\n" +
                        "\n" +
                        "WEBSITE::http://www.nita.ac.in/");
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("NIT_ALLAHABAD")) {
                flag.setText("YEAR OF ESTABLISHMENT::1961\n" +
                        "\n" +
                        "TRANSPORT::\n" +
                        "Nearest Airport : Bamrauli Air Force Base, Allahabad\n" +
                        "Distance from Airport : 15km\n" +
                        "Nearest Railway Station : Allahabad Junction Railway Station\n" +
                        "Distance from Railway Station : 13km\n" +
                        "\n" +
                        "RANKINGS::\n" +
                        "By NIRF in 2018 : 48\n" +
                        "By NIRF in 2017 : 41\n" +
                        "By Edu Rand in 2015 : 28\n" +
                        "By The Week in 2015 : 27\n" +
                        "\n" +
                        "FEES STRUCTURE::\n" +
                        "One Time Fees\t            ₹2,100\n" +
                        "Tuition Fee (per Semester)  ₹62,500\n" +
                        "Other fees (per Semester)   ₹4,525\n" +
                        "Annual Fees\t            ₹651\n" +
                        "----------------------      --------\n" +
                        "Total\t                    ₹69,77 6\n" +
                        "----------------------     ---------\n" +
                        "\n" +
                        "WEBSITE::http://www.mnnit.ac.in/\n" +
                        "\n" +
                        "\n" +
                        "\n");
            }/* else if(mToolbar.getTitle().toString().equalsIgnoreCase("NIT_")) {
                flag.setText((CharSequence) ContextCompat.getDrawable(collegeinfo.this, R.string.nitjalandhar));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Italy")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_italy));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Mexico")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_maxico));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Poland")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_poland));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Russia")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_russia));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("Spain")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_spain));
            } else if (mToolbar.getTitle().toString().equalsIgnoreCase("US")) {
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this, R.drawable.flag_us));
            }*/
        }
    }
}
