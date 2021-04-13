package com.fti.firstrecycleview;

import java.util.ArrayList;

public class BangtanData {
    private static String[] title = new String[] {"RM", "SEOK JIN", "SUGA", "J-HOPE", "JIMIN", "V", "JUNGKOOK"};

    private static int[] thumbnail = new int[] {R.drawable.rm, R.drawable.jin, R.drawable.suga, R.drawable.jhope, R.drawable.jimin, R.drawable.v, R.drawable.jk};

    public static ArrayList<MemberModel> getListData(){
        MemberModel memberModel = null;
        ArrayList<MemberModel> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++) {
            memberModel = new MemberModel();
            memberModel.setFotoMember(thumbnail[i]);
            memberModel.setNamaMember(title[i]);
            list.add(memberModel);
        }
        return list;
    }
}
