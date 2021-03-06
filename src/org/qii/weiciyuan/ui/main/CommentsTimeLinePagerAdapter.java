package org.qii.weiciyuan.ui.main;

import android.app.Fragment;
import android.app.FragmentManager;
import org.qii.weiciyuan.support.lib.AppFragmentPagerAdapter;
import org.qii.weiciyuan.ui.maintimeline.CommentsByMeTimeLineFragment;
import org.qii.weiciyuan.ui.maintimeline.CommentsToMeTimeLineFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * User: qii
 * Date: 13-3-8
 */
public class CommentsTimeLinePagerAdapter extends AppFragmentPagerAdapter {

    private List<Fragment> fragmentList;

    public CommentsTimeLinePagerAdapter(FragmentManager fm, MainTimeLineActivity activity, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
        fragmentList.add(0, activity.newCommentsTimeLineFragment());
        fragmentList.add(1, activity.newCommentsByMeTimeLineFragment());
    }


    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    protected String getTag(int position) {
        List<String> tagList = new ArrayList<String>();
        tagList.add(CommentsToMeTimeLineFragment.class.getName());
        tagList.add(CommentsByMeTimeLineFragment.class.getName());

        return tagList.get(position);
    }

    @Override
    public int getCount() {
        return 2;
    }

}
