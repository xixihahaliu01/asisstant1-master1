package com.ustc.sse.asisstant.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.ustc.sse.asisstant.MainActivity;
import com.ustc.sse.asisstant.R;
import com.ustc.sse.asisstant.adapter.TitlePagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Thinkpad on 2016/12/19.
 */

public class PagerFragment3 extends Fragment {
    @Nullable
    private List<View> list=null;
    //private String[] data={"apple","banana","orange","ssssss","sdasda","asddas","sdaasd","dassa"};
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.pager_page3,container,false);
        //设置滑动窗口
        ViewPager viewPager=(ViewPager)view.findViewById(R.id.tool_pic);
        list=new ArrayList<View>();

        ImageView imageView=new ImageView(getContext());
        imageView.setImageResource(R.drawable.tool_tianqi);
        list.add(imageView);
        imageView=new ImageView(getContext());
        imageView.setImageResource(R.drawable.tool_rili);
        list.add(imageView);
        imageView=new ImageView(getContext());
        imageView.setImageResource(R.drawable.tool_xing);
        list.add(imageView);
        imageView=new ImageView(getContext());
        imageView.setImageResource(R.drawable.tool_kebiao);
        list.add(imageView);

        TitlePagerAdapter titlePagerAdapter1=new TitlePagerAdapter(list);
        viewPager.setAdapter(titlePagerAdapter1);






        List<Map<String,Object>> item=new ArrayList<Map<String,Object>>();
        String []name=new String[] {"备忘录","课程表","扫一扫","天气通","查公交","地铁图","星座运势"};
        int []image=new int[]{R.drawable.tool_bei,R.drawable.tool_ke,R.drawable.tool_sao,R.drawable.tool_tian,R.drawable.tool_gong,R.drawable.tool_ditie,R.drawable.tool_xingzuo};

        for (int i=0;i<7;i++)
        {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name",name[i]);
            map.put("icon",image[i]);
            item.add(map);
        }
        ListView listView=(ListView)view.findViewById(R.id.tool_list1);
        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.,R.layout.main_menu)

        //GridView gridView=(GridView)view.findViewById(R.id.main_gridview);

        SimpleAdapter simpleAdapter=new SimpleAdapter(getContext(),item,R.layout.first_layout,new String[]{"name","icon"},new int[]{R.id.tool_text,R.id.tool_image});

        listView.setAdapter(simpleAdapter);
        return view;
    }
}
