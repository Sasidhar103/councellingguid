package in.climber.www.councellingguid;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.concurrent.Callable;

public class College_list extends ArrayAdapter<College> {
    private Activity context;
    private List<College> clgList;
    public College_list(Activity context, List<College> clgList)
    {   super(context,R.layout.college_list,clgList);
        this.context=context;
        this.clgList=clgList;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        final View listviewclg = inflater.inflate(R.layout.college_list,null,true);
        TextView textViewname = (TextView)listviewclg.findViewById(R.id.name);
        TextView textViewbranch = (TextView)listviewclg.findViewById(R.id.branch);
        TextView textViewcategory = (TextView)listviewclg.findViewById(R.id.cat);
        TextView textViewrank = (TextView)listviewclg.findViewById(R.id.rank);
        College clg = clgList.get(position);
        textViewname.setText(clg.getClgname());
        textViewbranch.setText(clg.getBch());
        textViewcategory.setText(clg.getCat());
        textViewrank.setText(clg.getRank());
        return listviewclg;
    }
}
