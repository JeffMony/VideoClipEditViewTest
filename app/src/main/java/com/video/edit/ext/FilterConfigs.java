package com.video.edit.ext;

import android.content.Context;

import com.video.edit.demo.R;
import com.video.edit.view.BottomDialogFragment;
import com.video.egl.GLImageComplexionBeautyFilter;
import com.video.epf.custfilter.GlPngFliter;
import com.video.epf.filter.GlFilter;

import java.util.ArrayList;
import java.util.List;

public class FilterConfigs {

    public static List<BottomDialogFragment.Option> createFilterOptions() {
        List<BottomDialogFragment.Option> result = new ArrayList<>();
        result.add(new BottomDialogFragment.Option(R.drawable.ic_beauty_no, "无", 0));
        result.add(new BottomDialogFragment.Option(R.drawable.ic_beauty_white, "美颜", 1));
        result.add(new BottomDialogFragment.Option(R.drawable.ic_beauty_white, "美白", 2));
        result.add(new BottomDialogFragment.Option(R.drawable.ic_filter_langman, "浪漫", 3));
        result.add(new BottomDialogFragment.Option(R.drawable.ic_filter_qinxin, "清新", 4));
        result.add(new BottomDialogFragment.Option(R.drawable.ic_filter_weimei, "唯美", 5));
        result.add(new BottomDialogFragment.Option(R.drawable.ic_filter_fennen, "粉嫩", 6));
        result.add(new BottomDialogFragment.Option(R.drawable.ic_filter_huaijiu, "怀旧", 7));
        result.add(new BottomDialogFragment.Option(R.drawable.ic_filter_landiao, "蓝调", 8));
        result.add(new BottomDialogFragment.Option(R.drawable.ic_filter_qingliang, "清凉", 9));
        result.add(new BottomDialogFragment.Option(R.drawable.ic_filter_rixi, "日系", 10));
        return result;
    }

    public static GlFilter getFilterByName(String name, Context context) {
        if (name.equals("无")) {
            return  new GlFilter();
        } else if (name.equals("美颜")) {
            return new GLImageComplexionBeautyFilter(context);
        } else {
            return new GlPngFliter(context, getFilterPngByType(name));
        }
    }

    public static String getFilterPngByType(String type) {
        if (type.equals("美白")) {
            return "filter_white";
        } else if (type.equals("浪漫")) {
            return "filter_langman";
        } else if (type.equals("清新")) {
            return "filter_qingxin";
        } else if (type.equals("唯美")) {
            return "filter_weimei";
        } else if (type.equals("粉嫩")) {
            return "filter_fennen";
        } else if (type.equals("怀旧")) {
            return "filter_huaijiu";
        } else if (type.equals("蓝调")) {
            return "filter_landiao";
        } else if (type.equals("清凉")) {
            return "filter_qingliang";
        } else if (type.equals("日系")) {
            return "filter_rixi";
        } else {
            return "filter_white";
        }
    }
}
