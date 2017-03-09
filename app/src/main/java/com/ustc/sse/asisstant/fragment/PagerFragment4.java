package com.ustc.sse.asisstant.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.ustc.sse.asisstant.R;
import com.ustc.sse.asisstant.adapter.TitlePagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * Created by Thinkpad on 2016/12/19.
 */

public class PagerFragment4 extends Fragment {
    private List<View> list=null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.pager_page4,container,false);
        //list=new ArrayList<View>();

       /* button_1=(Button)view.findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
        //ImageView imageView=new ImageView(getContext());
        //imageView.setImageResource(R.drawable.title_commercial);
        //list.add(imageView);


        //设置菜单
        List<Map<String,Object>> item=new ArrayList<Map<String,Object>>();
        String []name=new String[] {"我的收藏","我的帖子","我的对话","我的提醒","我的下载","我的交易","我的回复","帮助反馈","我的通知"};
        int []image=new int[]{R.drawable.person_col,R.drawable.person_file,R.drawable.person_dia,R.drawable.person_bell,R.drawable.person_download,R.drawable.person_transaction,R.drawable.person_reply,R.drawable.person_help,R.drawable.person_notice};

        for (int i=0;i<9;i++)
        {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name",name[i]);
            map.put("icon",image[i]);
            item.add(map);
        }

        GridView gridView=(GridView)view.findViewById(R.id.person_gridview);

        SimpleAdapter simpleAdapter=new SimpleAdapter(getContext(),item,R.layout.person_gird,new String[]{"name","icon"},new int[]{R.id.menu_text,R.id.menu_image});

        gridView.setAdapter(simpleAdapter);



        /*List<Map<String,Object>> toolitem=new ArrayList<Map<String,Object>>();
        String []toolname=new String[] {"备忘录","课程表","扫一扫","天气通","查公交","地铁图"};
        int []toolimage=new int[]{R.drawable.tool_bei,R.drawable.tool_ke,R.drawable.tool_sao,R.drawable.tool_tian,R.drawable.tool_gong,R.drawable.tool_ditie};

        for (int i=0;i<6;i++)
        {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name1",toolname[i]);
            map.put("icon1",toolimage[i]);
            toolitem.add(map);
        }
        ListView listView=(ListView)view.findViewById(R.id.tool_list);
        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.,R.layout.main_menu)

        //GridView gridView=(GridView)view.findViewById(R.id.main_gridview);

        SimpleAdapter simpleAdapter1=new SimpleAdapter(getContext(),toolitem,R.layout.first_layout,new String[]{"name1","icon1"},new int[]{R.id.tool_text,R.id.tool_image});

        listView.setAdapter(simpleAdapter1);*/




        return view;
    }
}
