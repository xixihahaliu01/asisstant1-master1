package com.ustc.sse.asisstant.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.ustc.sse.asisstant.R;
import com.ustc.sse.asisstant.activity.Dish_Recommand;
import com.ustc.sse.asisstant.adapter.TitlePagerAdapter;
import com.ustc.sse.asisstant.entity.Advertisement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Thinkpad on 2016/12/19.
 */

public class PagerFragment1 extends Fragment {

    private List<View> list=null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view=inflater.inflate(R.layout.pager_page1,container,false);

        //设置广告栏
        ViewPager viewPager=(ViewPager)view.findViewById(R.id.title_pic);
        //获取首页广告图片
        Advertisement advertisement=new Advertisement(getContext());
        list=advertisement.getAdvertisement();
        TitlePagerAdapter titlePagerAdapter=new TitlePagerAdapter(list);
        viewPager.setAdapter(titlePagerAdapter);





        //设置菜单
        List<Map<String,Object>> item=new ArrayList<Map<String,Object>>();
        String []name=new String[] {"美食推荐","生活指南","热门景点","园区出行","园区新闻","高校专栏","科研动态","二手交易"};
        int []image=new int[]{R.drawable.menu_food,R.drawable.menu_life,R.drawable.menu_view,R.drawable.menu_transport,R.drawable.menu_news,R.drawable.menu_school,R.drawable.menu_research,R.drawable.menu_recycle};

        for (int i=0;i<8;i++)
        {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name",name[i]);
            map.put("icon",image[i]);
            item.add(map);
        }

        GridView gridView=(GridView)view.findViewById(R.id.main_gridview);

        SimpleAdapter simpleAdapter=new SimpleAdapter(getContext(),item,R.layout.main_menu,new String[]{"name","icon"},new int[]{R.id.menu_text,R.id.menu_image});

        gridView.setAdapter(simpleAdapter);

       gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               switch(i)
               {
                   case 0: //美食推荐
                   {
                       Intent intent=new Intent(getActivity(), Dish_Recommand.class);
                       startActivity(intent);
                       break;
                   }
               }
           }
       });

        return  view;
    }


}
