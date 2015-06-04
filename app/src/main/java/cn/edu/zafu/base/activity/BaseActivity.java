package cn.edu.zafu.base.activity;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import cn.edu.zafu.base.R;

/**
 * a base activity with toolbar
 * please using the theme with no action bar.if you use the action bar theme,it seems to cash
 * Created by lizhangqu on 2015/6/4.
 */
public class BaseActivity extends AppCompatActivity {
    protected Toolbar toolbar;

    /**
     * shou toolbar
     * if the title is set ,the title will show else it will show the label set to the activity
     *
     * @param title
     */
    protected void showToolbar(String title) {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            if (title != null) {
                toolbar.setTitle(title);
            }
            toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
            toolbar.showOverflowMenu();
            setSupportActionBar(toolbar);

            if (showNavigationIcon()) {
                toolbar.setNavigationIcon(R.mipmap.toolbar_back);
                toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackPressed();
                    }
                });
            }
        }
    }

    /**
     * set true to show navigation icon
     *
     * @return
     */
    protected boolean showNavigationIcon() {
        return true;
    }
    /**
     * it seems not to work
     *show overflow menu icon
     **/
   /* @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        if (featureId == Window.FEATURE_ACTION_BAR && menu != null) {
            if (menu.getClass().getSimpleName().equals("MenuBuilder")) {
                try {
                    Method m = menu.getClass().getDeclaredMethod(
                            "setOptionalIconsVisible", Boolean.TYPE);
                    m.setAccessible(true);
                    m.invoke(menu, true);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return super.onMenuOpened(featureId, menu);
    }*/

}
