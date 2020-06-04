package com.hqbb.qianqiandeshengdan;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import com.hqbb.qianqiandeshengdan.view.CustomDialog;
import com.hqbb.qianqiandeshengdan.view.CustomInputDialog;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static String TAG = null;
    private ImageView hat;
    private ImageView bell;
    private ImageView flower;
    private ImageView wine;
    private ImageView snowflake;
    private ImageView letter;
    private ImageView glove;
    private ImageView pie_man;
    private ImageView gift;
    private ImageView sock;
    private ImageView candy_cane;
    private ImageView candy;
    private ImageView snow_man;
    private ImageView ring;
    private ImageView tree;
    private ImageView cake;
    private ImageView chrismasman;
    private ImageView deer;
    private ImageView sled;

    private Button wish;

    private String name = "";
    private List mList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TAG = this.getClass().getSimpleName();

        init();
    }

    private void init() {
        hat = findViewById(R.id.hat);
        bell = findViewById(R.id.bell);
        flower = findViewById(R.id.flower);
        wine = findViewById(R.id.wine);
        snowflake = findViewById(R.id.snowflake);
        pie_man = findViewById(R.id.pie_man);
        letter = findViewById(R.id.letter);
        glove = findViewById(R.id.glove);
        gift = findViewById(R.id.gift);
        cake = findViewById(R.id.cake);
        tree = findViewById(R.id.tree);
        ring = findViewById(R.id.ring);
        snow_man = findViewById(R.id.snow_man);
        candy = findViewById(R.id.candy);
        candy_cane = findViewById(R.id.candy_cane);
        sock = findViewById(R.id.sock);
        chrismasman = findViewById(R.id.chrismasman);
        deer = findViewById(R.id.deer);
        sled = findViewById(R.id.sled);
        wish = findViewById(R.id.wish);

        String hatMsg = "哇!\n你就是小仙女！\n恭喜你抽到一顶\n漂亮的小帽子！\n运气真是超级超级好了！\n戴上它，你就是整条街最靓的女里子！";
        String emptyMsg = "啊哦!\n啥都没抽中！\n没关系，还可以再抽一次！:p";
        String bigPrizeMsg = "激动到晕厥!\n概率万分之一的终极大奖你也能抽中！来啊，\n神仙水SK2\n送给美丽的小仙女！\n男朋友老了，你都还是十八岁！";
        String letterMsg = "哇!\n这个也不错哦！\n一封情书！\n甜甜的恋爱慕了！^0^\n";
        String foodMsg = "哦哦哦!\n看看这是什么！\n零食大礼包！\n看来你一定是饿坏了！\n吃了不胖，明天再减！";
        String cookMsg = "哇！\n一顿丰盛的晚餐！\n点点点，开始点菜模式吧！\n看，你的男朋友都已经准备好大展身手了！";
        String snowMsg = "哇！\n圣诞专属拐杖糖！\n甜甜的糖果给甜甜的你！\nYou are my honey！";
        String flowerMsg = "哈哈！\n鲜花！\n鲜花配美人！女孩子就是要有鲜花才有美好的心情啊！";
        String hugMsg = "赞！\n一个大大的拥抱！\n冬天一个暖暖的拥抱，所有寒冷都不知道跑哪去了！";
        String cakeMsg = "哈哈！\n小蛋糕！\n吃了它你可以一直享受甜甜蜜蜜！";
        mList.add(emptyMsg);
        mList.add(emptyMsg);
        mList.add(emptyMsg);
        mList.add(emptyMsg);
        mList.add(emptyMsg);
        mList.add(emptyMsg);
        mList.add(emptyMsg);
        mList.add(emptyMsg);
        mList.add(emptyMsg);
        mList.add(hatMsg);
        mList.add(bigPrizeMsg);
        mList.add(letterMsg);
        mList.add(foodMsg);
        mList.add(cookMsg);
        mList.add(snowMsg);
        mList.add(flowerMsg);
        mList.add(hugMsg);
        mList.add(cakeMsg);
    }

    private void openDialog(String title, Integer imageResId) {
        final CustomDialog dialog = new CustomDialog(MainActivity.this);
        dialog.setMessage(title)
                .setImageResId(imageResId)
                .setSingle(true)
                .show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.hat:
                setAnimateScale(hat);
                break;
            case R.id.bell:
                setAnimateScale(bell);
                break;
            case R.id.flower:
                setAnimateScale(flower);
                break;
            case R.id.wine:
                setAnimateScale(wine);
                break;
            case R.id.snowflake:
                setAnimateScale(snowflake);
                break;
            case R.id.pie_man:
                setAnimateScale(pie_man);
                break;
            case R.id.letter:
                setAnimateScale(letter);
                break;
            case R.id.glove:
                setAnimateScale(glove);
                break;
            case R.id.gift:
                setAnimateScale(gift);
                int i = (int) (Math.random()*mList.size());
                Log.d(TAG, "onClick: "+ i);
                String msg = name + "！" + mList.get(i);
                openDialog(msg, R.mipmap.congratulation);
                break;
            case R.id.ring:
                setAnimateScale(ring);
                break;
            case R.id.tree:
                setAnimateScale(tree);
                break;
            case R.id.cake:
                setAnimateScale(cake);
                break;
            case R.id.snow_man:
                setAnimateScale(snow_man);
                break;
            case R.id.candy:
                setAnimateScale(candy);
                break;
            case R.id.candy_cane:
                setAnimateScale(candy_cane);
                break;
            case R.id.sock:
                setAnimateScale(sock);
                break;
            case R.id.chrismasman:
                setAnimateScale(chrismasman);
                break;
            case R.id.sled:
                setAnimateScale(sled);
                break;
            case R.id.deer:
                setAnimateScale(deer);
                break;
            case R.id.wish:
                final CustomInputDialog dialog = new CustomInputDialog(MainActivity.this);
                dialog.setTitle("先告诉我你的名字哦~")
                        .setSingle(false)
                        .setOnClickBottomListener(new CustomInputDialog.OnClickBottomListener() {
                            @Override
                            public void onPositiveClick() {
                                name = dialog.getName();
                                if (name != null && name != "") {
                                    dialog.dismiss();
                                    Toast toast = Toast.makeText(MainActivity.this, "好了，" + name + "！可以抽你的小礼物了~", Toast.LENGTH_LONG);
                                    toast.setGravity(Gravity.CENTER, 0, 0);
                                    toast.show();
                                    wish.setVisibility(View.GONE);
                                }
                            }

                            @Override
                            public void onNegtiveClick() {
                                dialog.dismiss();
                            }
                        })
                        .show();
                break;

        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void setAnimateScale(final View view) {
        view.animate()
                .scaleX(1.5f).scaleY(1.5f)
                .setDuration(200)
                .setListener(new AnimatorListenerAdapter() {
                    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        view.animate()
                                .scaleX(1.0f).scaleY(1.0f)
                                .setDuration(200);
                    }
                }).start();
    }

}
