package com.pluribasic.map;

import java.lang.annotation.Annotation;
import java.net.*;
import java.io.*;
import java.util.Arrays;
import android.app.Activity;
import android.os.Build.VERSION;
import android.view.Surface;
import java.lang.ThreadGroup;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.app.ActivityManager;
import android.content.pm.ConfigurationInfo;
import android.view.View.OnClickListener;
import android.content.pm.ActivityInfo;
import android.content.ContextWrapper;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.os.*;
import android.view.KeyEvent;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.content.Context;
import android.widget.FrameLayout;
import android.view.View;
import android.widget.EditText;
import android.view.Window;
import android.content.Intent;
import android.util.Log;
import android.content.res.Configuration;
import android.widget.AdapterView;import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import java.util.concurrent.Semaphore;
import android.view.GestureDetector;
import android.app.KeyguardManager;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.graphics.Point;
import java.lang.NullPointerException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.math.RoundingMode;
import java.math.MathContext;
import java.lang.Process;
import java.math.BigDecimal;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.AbsListView;
import android.view.Gravity;
import android.view.ViewGroup;
import android.graphics.Typeface;
import android.graphics.Color;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff.Mode;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.inputmethod.InputMethodManager;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.R.anim.*;
import android.view.ViewManager;
import android.app.FragmentTransaction;
import android.view.SurfaceView;
import android.graphics.Color;;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.graphics.Movie;
import android.graphics.PixelFormat;
import android.text.InputType;
import android.widget.ArrayAdapter;;
import android.view.ViewGroup.MarginLayoutParams;
import android.text.method.PasswordTransformationMethod;
import android.text.TextUtils.TruncateAt;
import android.view.inputmethod.EditorInfo;
import android.text.InputFilter;
import android.graphics.PorterDuff;;
import android.graphics.Path;
import android.util.AttributeSet;
import android.graphics.Matrix;
import java.util.Random;
import android.view.View.OnFocusChangeListener;
import android.graphics.drawable.ColorDrawable;
import android.provider.Settings;
import android.content.SharedPreferences;
import android.location.*;
import java.util.Locale;
import android.location.LocationListener;
import android.location.LocationManager;
import android.content.pm.PackageManager;
import java.util.List;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.model.CameraPosition.Builder;
import android.app.Fragment;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.MapFragment;
import android.view.LayoutInflater;
import android.app.AppOpsManager;
import org.json.JSONObject;
import org.json.JSONArray;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import java.util.HashMap;
import android.support.v4.content.ContextCompat;
import android.support.v4.app.ActivityCompat;
import android.view.*;
import android.view.ContextThemeWrapper;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.widget.TimePicker;
import android.widget.DatePicker;
import com.pluribasic.map.R;
public class map extends Activity implements OnClickListener, LocationListener, OnMapReadyCallback
 {
    // Compiled using PluriBASIC 5.00.6.168929
    // Visit us at http://www.pluribasic.com


    final int WM_CREATE    = 1;
    final int WM_CREATED   = 517;
    final int WM_DESTROY   = 2;
    final int WM_CLICK     = 245;
    final int WM_LONGCLICK = 3;
    final int WM_KEYDOWN   = 256;
    final int WM_KEYUP     = 257;
    final int WM_TIMER     = 275;
    final int WM_TOUCH     = 3000;
    final int WM_MOUSEMOVE = 512;
    final int WM_RELEASE   = 3001;
    final int WM_IMAGEDONE = 3002;

    private static boolean _GD = false;
    public String CommandLine  = "";
    private sysFISY FS         = new sysFISY();
    private B2pAFC FCAC        = new B2pAFC();
    public Object  DBconn      = null;
    public Object  DBsearch    = null;
    public Object  DBcommand   = null;
    public Integer DBmatches   = 0;
    public String  DBlasttbl   = "";
    public String  DBprefix    = "";
    public Integer DBcurmatch  = 0;
    public String  DQlastquery = "";
    public String  DBlasterr   = "";
    public Integer[] _Thread   = new Integer[101];


    private Integer Hstatusbar = 0;
    private Context AppContext = this;
    private sysCFG cfg = null;
    private boolean _MsgBox = false;
    private boolean OPT_GOOGLEPLAY = true;
    private int     OPT_APIVERSION = 31;

     // Starts definition of global variables, UDT's, files and forms.
    GestureDetector PLBgdetector;
    View.OnTouchListener PLBgestureListener;
    public final Integer _Ctarget = 2;
    public final  Integer _APIver = ((android.os.Build.VERSION.SDK_INT * 10) * 1000);
    static final Integer[] Gpsfk = {0};
    static final Integer[] Gpson = {0};
    static final Integer[] Gpsgt = {0};
    static final Double[] Gpslat = {null};
    static final Double[] Gpslng = {null};
    LocationManager PLBlm1 = null;
    Boolean _MVlock = false;
    Boolean gpsRequ1 = false;
    Boolean gpsRequ2 = false;
    final LocationListener Twhere[]  = {null};
    MapFragment mapFragment = new MapFragment();
    private HashMap<Marker, MkInfo> Emm;
    public Typeface _MVfont = null;
    public Integer _MVfcol = 0;
    public Integer _MVfsiz = 8;
    final public Boolean plbPermAnswer2001[] = {false};
    final public Boolean plbPermAnswer2002[] = {false};

    public void removeNavigationBar()
      {
      }
    public void _PermissionRequestor()
      {
        
      if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP)
        {
          try{if (ActivityCompat.checkSelfPermission(AppContext, android.Manifest.permission.ACCESS_COARSE_LOCATION)!=PackageManager.PERMISSION_GRANTED)
          {
             String[] APP_PERMITS_ACCESS_COARSE_LOCATION={android.Manifest.permission.ACCESS_COARSE_LOCATION};
             requestPermissions(APP_PERMITS_ACCESS_COARSE_LOCATION, 2001);
             do {try {Thread.sleep(100);} catch(InterruptedException e) { }} while (!plbPermAnswer2001[0]);
          }} catch (Exception ee) {}
        try{if (ActivityCompat.checkSelfPermission(AppContext, android.Manifest.permission.ACCESS_FINE_LOCATION)!=PackageManager.PERMISSION_GRANTED)
          {
             String[] APP_PERMITS_ACCESS_FINE_LOCATION={android.Manifest.permission.ACCESS_FINE_LOCATION};
             requestPermissions(APP_PERMITS_ACCESS_FINE_LOCATION, 2002);
             do {try {Thread.sleep(100);} catch(InterruptedException e) { }} while (!plbPermAnswer2002[0]);
          }} catch (Exception ee) {}

        }

      }
    public void _Defineglobals(Integer hwnd, Integer cb, Integer mode)
      {
        switch (mode)
         {
           case 1 :
              
              break;
           case 2 :
              
              break;
           default :
              break;
         }
        if (_GD) {return;} else {_GD = true;}
        gpscoords(new Double[] {0.0d}, new Double[] {0.0d});
        Emm = new HashMap<Marker, MkInfo>();
        pluribasicRequestGoogleMapPermissions();
        
        removeNavigationBar();
      }


     // Starts user code. 
    RelativeLayout initialRL[] = {null};
    @Override
    public void onCreate(Bundle savedInstanceState)
      { 
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        initialRL[0] = new RelativeLayout(this);
        RelativeLayout.LayoutParams rp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        rp.addRule(RelativeLayout.CENTER_IN_PARENT);
        setContentView(initialRL[0], rp);
        if (savedInstanceState==null) {_Defineglobals(0, 0, 0);}
        PLBgdetector = new GestureDetector(this, new PLBGestureDetector());
        PLBgestureListener = new View.OnTouchListener() {
           public boolean onTouch(View v, MotionEvent event) {
             return PLBgdetector.onTouchEvent(event);
          }
        };
        if (savedInstanceState!=null) {plbRestoreInstanceState(savedInstanceState);}
        ThreadGroup group = new ThreadGroup("Almighty");
        new Thread(group, new PluriBASICmain(), "PluriBASIC", 2000000).start();
      }
    public void plbRestoreInstanceState(Bundle vstate)
     {
     }
    @Override
    public void onClick(View v) {}
    class PLBGestureDetector extends SimpleOnGestureListener
      {
    @Override
    public boolean onDown(MotionEvent event)
      {
        plbTouchEvent(event, event, WM_TOUCH, 0, 0);
        plbTouchEvent(event, event, 573, 0, 0);
        return true;
      }
    @Override
    public boolean onDoubleTap(MotionEvent event)
      {
        plbTouchEvent(event, event, 3015, 0, 0);
        return true;
      }
    @Override
    public void onShowPress(MotionEvent event)
      {
        plbTouchEvent(event, event, 3021, 0, 0);
      }
    @Override
    public boolean onSingleTapUp(MotionEvent event)
      {
        plbTouchEvent(event, event, 574, 0, 0);
        return true;
      }
    @Override
    public boolean onDoubleTapEvent(MotionEvent event)
      {
        plbTouchEvent(event, event, 3016, 0, 0);
        return true;
      }
    @Override
    public boolean onFling(MotionEvent event, MotionEvent e2, float vx, float vy)
      {
        plbTouchEvent(event, event, 574, 0, 0);
        plbTouchEvent(event, event, 3017, vx, vy);
        return true;
      }
    @Override
    public void onLongPress(MotionEvent event)
      {
        plbTouchEvent(event, event, 3018, 0, 0);
      }
    @Override
    public boolean onSingleTapConfirmed(MotionEvent event)
      {
        plbTouchEvent(event, event, 3019, 0, 0);
        return true;
      }
    @Override
    public boolean onScroll(MotionEvent event, MotionEvent e2, float vx, float vy)
      {
        plbTouchEvent(e2, event, 512, vx, vy);
        return true;
      }
    }
    public boolean plbTouchEvent(MotionEvent event, MotionEvent e1, int custom, final float vx, final float vy)
      {
        if (cfg==null) {return false;}
        final Integer cc = (int) event.getPointerCount();
        final Integer ms = (int) event.getDownTime();
        final Integer i  = (int) event.getActionIndex();
        final Integer[] msg = {custom};
        final Integer   act = e1.getActionMasked();
        final Integer x     = (int) event.getX();
        final Integer y     = (int) event.getY();
        final Integer sx    = (int) e1.getX();
        final Integer sy    = (int) e1.getY();
        Integer mx          = cc;
        final DCC[] c = {new DCC()};
        if (custom==0)
          {
            switch (act) {
              case MotionEvent.ACTION_DOWN : 
              case MotionEvent.ACTION_CANCEL : 
              case MotionEvent.ACTION_POINTER_DOWN : 
                 msg[0] = WM_TOUCH;
                 mx = 1;
                 break;
              case MotionEvent.ACTION_UP :
              case MotionEvent.ACTION_POINTER_UP : 
                 msg[0] = WM_RELEASE;
                 mx = 1;
                 break;
              case MotionEvent.ACTION_MOVE :
                 msg[0] = WM_MOUSEMOVE;
                 break;
              default :
                 msg[0] = 3020;
                 mx = 1;
                 break;
            }
          }
          try {
            for (int ii = 0; ii<mx; ii++)
               {
                 Integer xt        = (int) event.getX(ii);
                 Integer yt        = (int) event.getY(ii);
                 c[0].x[ii]        = xt;
                 c[0].y[ii]        = yt;
                 c[0].startx[ii]   = sx;
                 c[0].starty[ii]   = sy;
                 c[0].dialogx[ii]  = cfg.xredux(xt);
                 c[0].dialogy[ii]  = cfg.yredux(yt);
                 if (ii>0 && (msg[0]!=WM_MOUSEMOVE && msg[0]!=3020)) {break;}
                 if (cfg.dlgcnvs[cfg.display][0]!=null)
                   {
                     if (cfg.dlgcnvs[cfg.display][0] instanceof CanvasView)
               {
                 CanvasView cv   = (CanvasView) cfg.dlgcnvs[cfg.display][0];
                 c[0].canvasx[ii] = (int) (cv.calc_x * (xt / (float) cv.client_x));
                 c[0].canvasy[ii] = (int) (cv.calc_y * (yt / (float) cv.client_y));
               }

                   }
               }
           } catch (Exception ee) {}
        new Thread(new Runnable() {public void run()
         {
          c[0].callback[0] = cfg.getcurc();
          c[0].hwnd[0]     = (int)cfg.display;
          c[0].id[0]       = i;
          c[0].count[0]    = cc;
          c[0].ctype[0]    = 1;
          c[0].msg[0]      = msg[0];
          c[0].lparam[0]   = ms;
          c[0].wparam[0]   = i;
          c[0].xparam[0]   = act;
          if (cfg.dlgcnvs[cfg.display][0]==null)
            {
              c[0].widget[0] = "dialog";
            }
          else
            {
              c[0].widget[0]  = "gameview";
            }
          c[0].velx[0]   = _CD(vx);
          c[0].vely[0]   = _CD(vy);
          _Dlgproc(c, c[0].callback[0]);
          if ((msg[0]).equals(WM_TOUCH))
            {
               c[0].msg[0] = 573;
              _Dlgproc(c, c[0].callback[0]);
            }
          else if ((msg[0]).equals(WM_RELEASE))
            {
               c[0].msg[0] = 574;
              _Dlgproc(c, c[0].callback[0]);
            }
         }}).start();
        return true;
      }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
      {
        if (keyCode == KeyEvent.KEYCODE_BACK)
          {
            new Thread(new Runnable() {public void run() {if (cfg!=null) {cfg.sendmessage("#", 274, 61536, 100);}}}).start();
            return true;
          }
        else
          {
            Integer otherKeys = 0;
            if (event.isShiftPressed()) {otherKeys = otherKeys | 2;}
            final int kc = keyCode;
            final int ok = otherKeys;
            new Thread(new Runnable() {public void run() {if (cfg!=null) {cfg.sendmessage("*", 256, kc, ok);}}}).start();
            //cfg.sendmessage("*", 256, keyCode, otherKeys);
          }
        return super.onKeyDown(keyCode, event);
      }
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event)
      {
        Integer otherKeys = 0;
        if (event.isShiftPressed()) {otherKeys = otherKeys | 2;}
        final int kc = keyCode;
        final int ok = otherKeys;
        new Thread(new Runnable() {public void run() {if (cfg!=null) {cfg.sendmessage("*", 257, kc, ok);}}}).start();
        //cfg.sendmessage("*", 257, keyCode, otherKeys);
        return super.onKeyUp(keyCode, event);
      }
    @Override
    public void onPause()
      {
        super.onPause();
        new Thread(new Runnable() {public void run() {if (cfg!=null) {cfg.sendmessage("*", 570, 0, 0);}}}).start();
        if (cfg!=null) {cfg.minimized = true;}
        new Thread(new Runnable() {public void run() {if (cfg!=null) {cfg.sendmessage("*", 274, 61472, 0);}}}).start();
    
      }
    @Override
    public void onResume()
      {
        super.onResume();
        removeNavigationBar();
        new Thread(new Runnable() {public void run() {if (cfg!=null) {cfg.sendmessage("*", 571, 0, 0);}}}).start();
        if (cfg!=null) {cfg.minimized = false;}
        new Thread(new Runnable() {public void run() {if (cfg!=null) {cfg.sendmessage("*", 274, 61488, 0);}}}).start();
    
      }
    @Override
    public void onDestroy()
      {
        super.onDestroy();
        final Integer isf = this.isFinishing()?-1:0;
        new Thread(new Runnable() {public void run() {if (cfg!=null) {cfg.sendmessage("*", 575, 0, isf);}}}).start();
      }
    //@Override
    //public void onWindowFocusChanged(boolean hasFocus)
    // {
    //    super.onWindowFocusChanged(hasFocus);
    //    removeNavigationBar();
    //    new Thread(new Runnable() {public void run() {if (cfg!=null) {cfg.sendmessage("*", 576, 0, 0);}}}).start();
    //  }
    
    @Override 
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)
      {
        final int RC = requestCode;
        final int GR = grantResults[0];
        switch(requestCode) 
          {
             case 0 : break;
             
             case 2001 : 
                plbPermAnswer2001[0] = true;
                break;

             case 2002 : 
                plbPermAnswer2002[0] = true;
                break;

          }
        new Thread(new Runnable() {public void run() {cfg.sendmessage("*", 244, RC, GR); _PermissionRequestor();}}).start();
      }
    @Override
    public void onSaveInstanceState(Bundle vstate)
     {
    
       new Thread(new Runnable() {public void run() {if (cfg!=null) {cfg.sendmessage("*", 625, 0, 0);}}}).start();
       super.onSaveInstanceState(vstate);
     }
    @Override
    public void onRestoreInstanceState(Bundle vstate)
     {
       super.onRestoreInstanceState(vstate);
       new Thread(new Runnable() {public void run() {if (cfg!=null) {cfg.sendmessage("*", 626, 0, 0);}}}).start();
    
     }
     @Override
     protected void onActivityResult(int requestCode, int resultCode, Intent data)
       {
         switch (requestCode)
          {
            case 9999 :
                if (resultCode == -1) {cfg.captimg = -1;} else {cfg.captimg = 2;}
                break;
            case 9998 : 
            case 9997 : 
               if (resultCode == RESULT_OK) {cfg.BTResult = -1;} else {cfg.BTResult = 0;}
                break;
            case 9996 :
                if (resultCode == -1) {cfg.uninstall = -1;} else {cfg.uninstall = 2;}
                break;
            default : 
               cfg.systemsendmessage("*", 3029, requestCode, resultCode, "", data, null);
                break;
          }
       }
      @Override
      public void onConfigurationChanged(Configuration newConfig) {
          super.onConfigurationChanged(newConfig);
          setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);
          if (cfg==null) {return;}
          if (newConfig.hardKeyboardHidden == Configuration.HARDKEYBOARDHIDDEN_NO) {
            new Thread(new Runnable() {public void run() {cfg.sendmessage("*", 610, 1, 1);}}).start();
          } else if (newConfig.hardKeyboardHidden == Configuration.HARDKEYBOARDHIDDEN_YES){
            removeNavigationBar();
            new Thread(new Runnable() {public void run() {cfg.sendmessage("*", 610, 1, 0);}}).start();
          }
          new Thread(new Runnable() {public void run() {cfg.sendmessage("*", 610, 0, 0);}}).start();
          if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                new Thread(new Runnable() {public void run() {cfg.sendmessage("*", 610, 3, -4);}}).start();
          } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
                new Thread(new Runnable() {public void run() {cfg.sendmessage("*", 610, 3, -2);}}).start();
          }
      }
    class PluriBASICmain implements Runnable
      {@Override
       public void run() {
        KeyguardManager _Km = (KeyguardManager) AppContext.getSystemService(Context.KEYGUARD_SERVICE);
        while (_Km.inKeyguardRestrictedInputMode()) {try {Thread.sleep(300);} catch(InterruptedException e) { }}
        try {Thread.sleep(300);} catch(InterruptedException e) { }
        if (cfg==null) {cfg = new sysCFG();}
        _PermissionRequestor();
        final  int[] ccv = {0}; final  int[] _Az = {0};
        while (1>0) {
    
        final  int[] err = {0}; final  int[] erl = {0}; final  int[] rel = {0}; final  int[] esv = {0}; final  int[] ite = {0};
        MySQL_Connect("ponemexico", "ponemexico", "ponemexico", "localhost");
    
        final  String[] _Dat = {""}; final  int datacount = 0; 
    
        final  Integer[] hdlg = {0}; 
        DialogNew(0, "map", "", null, 0, 0, 360, 640, _CI(0), 0, 1, hdlg, err, erl, 0, rel, 14); 
        DialogShow(hdlg[0], 0, 1, err, erl, 0, rel, 16); 
        android.os.Process.killProcess(android.os.Process.myPid());
        finish();System.exit(0); break;} while (ccv[0]>1); return;}
      }

    public Integer _Dlgproc(DCC[] cb, final  Integer cc)
     { 
       Integer tv = 0;
       if (cb[0].hwnd[0]<-2000) {cb[0].hwnd[0] = cfg.gethwnd(cc);}
       
       cfg.sysactions(cb, new Integer[] {0});
       return 0;
     }

    // Starts support modules. 

    //Starts code from extension 'ALL_REQUIRED_VARS.bin' (Mainapp)
    
    public String[] form_topscripts = {""};
    public String[] form_bottomscripts = {""};
    public String[] form_header = {""};
    public String[] form_body = {""};
    public String[] form_contents = {""};
    public String[] form_footer = {""};
    public String[] form_left = {""};
    public String[] form_menu = {""};
    public String[] form_right = {""};
    public String[] form_title = {""};
    public String[] form_errors = {""};
    public String[] form_numerr = {""};
    public String[] sys_field = {""};
    public String[] sys_value = {""};
    public String[] sys_string = {""};
    public String[] sys_color = {""};
    public String[] form_result = {""};
    public String[] sys_arr = {""};
    public String[] sys_img = {""};
    public String[] sys_list = {""};
    public String[] sys_path = {""};
    public String[] sys_langto = {""};
    public String[] sys_report = {""};
    public Integer[] form_flawed = {0};
    public Integer[] sys_index = {0};
    public Integer[] sys_count = {0};
    public String[] sys_before = {""};
    public String[] sys_after = {""};
    public Object[] sys_variant = null;
    
    public byte _CB(Object ni)//1
      {
        byte retval = 0;
        if (ni instanceof Number) 
          {
            retval = (byte) ((Number)ni).intValue();
          } 
        else if (ni instanceof Boolean)
          {                              
            if ((Boolean) ni) {retval = (byte) 255;} else {retval = (byte) 0;}
          }
        return retval;  
      }    
   
    public Integer _CI(Object ni)
      {
        Integer retval = 0;
        if (ni instanceof Double)
          {
            retval = (int) Math.floor((double)(Double)ni);
          }
        else if (ni instanceof Number) 
          {
            retval = ((Number)ni).intValue();
          } 
        else if (ni instanceof Boolean) 
          {                            
            retval = ((Boolean) ni) ? -1 : 0;
          }
        return retval;  
      }
      
    public Integer _CC(Object ni)
      {
        int retval = 0;
        if (ni instanceof Double)
          {
            DecimalFormat f = new DecimalFormat("#");
            Double real   = ((double)ni);
            f.setRoundingMode(RoundingMode.HALF_EVEN);
            return Integer.valueOf(f.format(real));            
          }
        else if (ni instanceof Number) 
          {
            retval = ((Number)ni).intValue();
          } 
        else if (ni instanceof Boolean) 
          {                            
            retval = ((Boolean) ni) ? -1 : 0;
          }
        return retval;  
      }            
           
    public Double _CD(Object ni)
      {
        Double retval = 0.0;
        if (ni instanceof Number) 
          {
            retval = ((Number)ni).doubleValue();
          } 
        else if (ni instanceof Boolean) 
          {
            retval = ((boolean) ni) ? -1.0 : 0.0;
          }
        return retval;  
      }
    public Double _Cd(Object ni) {return _CD(ni);}
    
    public Double _EXP(Object v1, Object v2)
      {
        return Math.pow(_CD(v1), _CD(v2)); 
      }
      
    public Integer istrue(Object ni) 
      {
        Integer retval = _CI(ni);        
        return retval;
      }      

    public Integer isfalse(Object ni) 
      {      
        Integer retval = _CI(ni);
        if (retval==0) {retval = -1;} else {retval = 0;} 
        return retval;
      }
      
    private Byte _UB(Object byt)
      {
         byte bb = ((byte)((Number)byt).intValue());
         return (byte) (bb & (0xff));
      }
      
     private Integer _SB(Object byt)
      {
         Integer b1 = ((Number)byt).intValue();
         b1 = b1 % 256;                  
         if (b1<0) {b1=256+b1;}
         return b1;
      }

     private Integer _SL(Object value)
      {
         try {         
         Long l1 = ((Number)value).longValue();
         l1 = ((l1 + 2147483648L) % 4294967298L);
         return (int) (l1 -2147483648L);
         } catch (Exception ee) {return 0;}
      }
            
     private Integer _SW(Object byt)
      {
         Integer b1 = ((Number)byt).intValue();
         if (b1<0) {b1 = 65536+b1;}
         return (int) (b1 % 65536);
      }
      
     private Integer _SD(Object num)
      {
         Long l1 = ((Number)num).longValue();
         if (l1<0) {return (int)(long)l1;}          
         l1 = (l1 % 4294967298L); // put it inside the dword range.
         if (l1>2147483648L) {l1 = -2147483648+(l1-2147483648L);} //now put it inside the LONG range.
         return (int)(long)l1;
      }      
      
     private Long _DW(Object byt)
      {
         Long b1 = ((Number)byt).longValue();
         if (b1<0) {b1 = 4294967296L+b1;}
         return (long) (b1 % 4294967296L);
      }      

     private Integer _SI(Object byt)
      {
         Integer b1 = ((Number)byt).intValue() + 32767;
         return (b1 % 65536) - 32767;
      }                 
      
    public boolean bistrue(Object ni) {return (istrue(ni)!=0);}
    public boolean bisfalse(Object ni) {return (istrue(ni)==0);}
    //public boolean accver(Double ver) {return cfg.i(31000)>=ver;}
    public boolean accver(Integer ver) {return _APIver >= ver;}
    
    // Returns a comparable number. 
    public static String _Cv(Object n)
      {
        String ns = "";
        if (n instanceof Number)
          { 
            ns = String.valueOf((Number) n);
          }
        else if (n instanceof Boolean) 
          {
            ns = ((boolean) n) ? "-1" : "0";
          }          
           
        if (ns.endsWith(".0")) {ns = ns.substring(0, ns.length()-2);}
        return ns;
      }
      
    public String _Cs(Object ni)
      {
        if (ni instanceof String) {return (String) ni;}
        if (ni instanceof Integer) {return String.valueOf(_CI(ni));}
        if (ni instanceof Double) {return String.valueOf(_CD(ni));}
        return "";  
      }
     
    public void CloneType(Object src, Object trg) // Deep Clones a type to use it as a BYVAL parameter.
     {
       Object[] obj1 = {null};
       Object[] obj2 = {null};              
       Class<?> cl1 = src.getClass();
       Class<?> cl2 = null;
       
       if (src.getClass().getName().equals(trg.getClass().getName()))
         {
           cl2 = trg.getClass();
         }           
       else
         {
           //trg = new
           cl2 = src.getClass();         
         }
       
                 
       try 
        {
         Method udt1 = cl1.getMethod("getVar", String.class, Object[].class);
         Method udt2 = cl2.getMethod("getVar", String.class, Object[].class);         
         udt1.invoke(src, "VFLGS", obj1);         
         String[][] mem = (String[][]) obj1[0];       
         for (int i = 0; i < mem.length; i++)
           {
             udt1.invoke(src, mem[i][0], obj1);
             udt2.invoke(trg, mem[i][0], obj2);                          
             switch (mem[i][1].substring(0, 2))
               {
                 case "%!"  : // TEXT               
                 case "$,"  :
                 case "$$"  :                          
                    String[] sa1 = (String[]) obj1[0];
                    String[] sa2 = (String[]) obj2[0];                    
                    sa2[0] = sa1[0];
                    sa2[1] = sa1[1];
                    break;
                 case "!,"   :
                 case "#,"   :
                 case "##"   :                 
                 case "@@,"  :
                    Double[] sb1 = (Double[]) obj1[0];
                    Double[] sb2 = (Double[]) obj2[0];
                    sb2[0] = sb1[0];
                    sb2[1] = sb1[1];
                    break;  
                 case "%%"  : // Boolean    
                 case "&,"  : // NUMERICS
                 case "%,"  :
                 case "?,"  :
                 case "??"  :
                 case "&&"  :                 
                    Integer[] sc1 = (Integer[]) obj1[0];
                    Integer[] sc2 = (Integer[]) obj2[0];
                    sc2[0] = sc1[0];
                    sc2[1] = sc1[1];
                    break;
                 case "~"  :                 
                    Object[] sd1 = (Object[]) obj1[0];
                    Object[] sd2 = (Object[]) obj2[0];
                    sd2[0] = sd1[0];
                    sd2[1] = sd1[1];
                    break;                    
                 default    : 
                    CloneType(obj1[0], obj2[0]);
                    break;                    
               }
           }
        }
       catch (Exception ee) 
        {  
          return;        
        }
     }
     
   private Integer getNextThreadId()
     {
        for (int i=1; i<99; i++)
          {
            if (_Thread[i]==null || _Thread[i]==0)
              { 
                _Thread[i] = -1; 
                return i;
              }
          }
        return 0;
     }
    //Ends code from extension 'ALL_REQUIRED_VARS.bin' (Mainapp)

    //Starts code from extension 'GETSYSTEMFOLDER.bin' (Mainapp)

    // Tries to retrieve a special directory.  
    public String GetSystemFolder(Integer dir)//1
      {
        if (dir==null) {return "";}
        String theDirectory = "";
        theDirectory = System.getProperty("user.home") + "\\";
        return theDirectory;
        
      }
    //Ends code from extension 'GETSYSTEMFOLDER.bin' (Mainapp)

    //Starts code from extension 'ROUND.bin' (Mainapp)


    // Rounds a number and returns the integer part of it. 
    public Integer RoundI(Object num, Integer digits)//1
      {
        if (num instanceof Double)
          {
            BigDecimal b = new BigDecimal((Double)num);
            String s = b.toPlainString();
            s = s.replaceAll("^\\-","");
            s = s.replaceAll("\\.\\d+$","");
            int precision = s.length() + digits;
            MathContext mc = new MathContext(precision,RoundingMode.HALF_UP);            
            return (int)(double)b.round(mc).doubleValue();
          }
        else if (num instanceof Number) 
          {
            return ((Number)num).intValue();
          } 
        else if (num instanceof Boolean) 
          {                            
            return ((Boolean) num) ? -1 : 0;
          }
        else
          {
            return 0;
          }  
      }
    //Ends code from extension 'ROUND.bin' (Mainapp)

    //Starts code from extension 'HIDEKEYBOARD.bin' (Mainapp)

    // hides the keyboard if visible.  
    public void hidekeyboard( )//0
      {
        try 
         {        
           InputMethodManager im = (InputMethodManager) getApplicationContext().getSystemService(AppContext.INPUT_METHOD_SERVICE);
           im.hideSoftInputFromWindow((null == getCurrentFocus()) ? null : getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_IMPLICIT_ONLY);
           im.hideSoftInputFromWindow((null == getCurrentFocus()) ? null : getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
         } 
        catch (Exception e) 
         { 
         }
      }
    //Ends code from extension 'HIDEKEYBOARD.bin' (Mainapp)

    //Starts code from extension 'ALL_REQUIRED_FUNCS.bin' (Mainapp)


    // this is used to communicate with OpenGL engine.
    public void internalSendMessage(Integer hwnd, Integer msg, Integer cb, String nam, Integer type, Integer lparam, Integer wparam)//0
      { 
        final DCC[] c = {new DCC()};
        c[0].isctrl[0]   = false;
        c[0].hwnd[0]     = hwnd;
        c[0].ctype[0]    = type;
        c[0].widget[0]   = nam;
        c[0].msg[0]      = msg;
        c[0].lparam[0]   = lparam;
        c[0].wparam[0]   = wparam;
        c[0].count[0]    = wparam;
        c[0].object[0]   = 1;
        c[0].callback[0] = cb;
        
         _Dlgproc(c, c[0].callback[0]); return;

      }  

    private class customListviewAdapter extends ArrayAdapter<String> 
      {            
        public Integer iii = 0; 
        public Integer TextStyle = null; 
        public Integer TextColor = null; 
        public Integer TextSize  = null;
        public Integer HeadColor = Color.parseColor("#E0E0E0");
        public Integer RowColor  = Color.parseColor("#FFFFFF");        
        public Integer SepColor  = Color.parseColor("#00FF00");
        public Integer RowHeight = cfg.yscaled(22); 
        public Integer TOP       = 0; 
        public Integer LEFT      = 0; 
        public Typeface dFont    = null;
        public RelativeLayout[] RowRls  = null; 
        public String[] RowText  = null; 
        public String[] RowTag   = null;
        public Boolean[] RowHead = null;
        public Integer[] ico     = null;
        public boolean activated = false;
        public ListView lv       = null;
        //public ArrayList<Product> values;               
        public View[] vs = null; 
        public customListviewAdapter(Context context, String[] strings, Integer ctlid) 
          {
            super(context, -1, -1, strings); 
            iii = ctlid; String[] ss = {""};
            RowRls  = new RelativeLayout[strings.length]; 
            RowText = new String[strings.length]; 
            RowTag  = new String[strings.length];
            RowHead = new Boolean[strings.length];
            ico     = new Integer[strings.length];
            vs      = new View[strings.length];
            for (int i = 0; i < strings.length; i++)
              {
                ico[i] = 0;
                RowHead[i] = false;
                if (strings[i]==null)
                 {
                  RowText[i] = "";
                  RowTag[i]  = "";                  
                 }
                else if (strings[i].contains("\0"))
                 {
                  ss = strings[i].split("\0");
                  if (ss.length>0) {RowText[i] = ss[0] + " ";} else {RowText[i] = " ";}
                  if (ss.length>1) {RowTag[i] = ss[1] + " ";} else {RowTag[i] = " ";}
                  if (ss.length>2) {if (ss[2].equals("header")) {RowHead[i] = true;}}
                 }
                else
                 {
                  RowText[i] = strings[i];
                  RowTag[i]  = "";
                 }                 
              }
            this.activated = true;              
          }         

        public void getRows(String[][] values) 
          {
            values[0] = new String[RowText.length]; 
            for (int i = 0; i<RowText.length; i++)
              {
                values[0][i] = RowText[i] + "\0" + RowTag[i]; 
              }
          }
        public String[] getTexts() 
          {
            return RowText;
          }          
        public String[] getTags() 
          {
            return RowTag;
          }
          
        public void setListView(ListView tt) {lv = tt;}
        public void setCtlColors(Integer tCol, Integer tSize) {TextColor = tCol; TextSize  = tSize;}
        public void setFontColor(Integer tCol) {TextColor = tCol;}
        public void setSepColor(Integer sCol) {lv.setDivider(new ColorDrawable(sCol));}
        public void setSepSize(Integer sSize) {lv.setDividerHeight(sSize);}
        public void setFontSize(Integer tSize) {TextSize  = tSize;}
        public void setCtlFont(Typeface fnt) {dFont = fnt;}
        public void setCtlStyle(Integer stl) {TextStyle = stl;}
        public void setIcon(Integer rwn, Integer img)
          {
            if (rwn < 0) {return;}
            if (rwn > ico.length) {return;}            
            if (img!=0) {ico[rwn] = img;} else {ico[rwn] = 0;}
          }  
        public void setText(Integer rwn, String nwt) 
          {
            if (rwn < 0) {return;}
            if (rwn > RowTag.length) {return;}
            if (!nwt.contains("\0")) {RowText[rwn] = nwt;} else {String[] tt = nwt.split("\0"); RowText[rwn] = tt[0]; RowTag[rwn] = tt[1];}   
          }
        public String getText(Integer rwn) 
          {
            if (rwn < 0) {return "";}
            if (rwn > RowTag.length) {return "";}
            return RowText[rwn];
          }
        public void setHeight(Integer nws) 
          {
            if (nws < 1) {return;}
            RowHeight = nws;
            for (int i = 0; i<vs.length; i++)
             {
              if (vs[i]!=null)
               {
                View lt = (View) vs[i];
                LayoutParams lp = (LayoutParams) lt.getLayoutParams();
                lp.height = cfg.yscaled(RowHeight);
                lt.setLayoutParams(lp);
               }
             }
          }
        public Integer getHeight() 
          {
            if (RowHeight < 1) {return 0;}
            return RowHeight;
          }
        public void setLEFT(Integer nw) 
          {
            if (nw < 0) {return;}
            this.LEFT = nw;
            for (int i = 0; i<vs.length; i++)
             {
              if (vs[i]!=null)
               {
                View lt = (View) vs[i];
                LayoutParams lp = (LayoutParams) lt.getLayoutParams();
                lp.leftMargin = cfg.xscaled(this.LEFT);
                lt.setLayoutParams(lp);
               }
             }            
          }
        public Integer getLEFT() 
          {
            if (this.LEFT < 1) {return 0;}
            return LEFT;
          }          
        public void setTOP(Integer nw) 
          {
            if (nw < 0) {return;}
            this.TOP = nw;
            for (int i = 0; i<vs.length; i++)
             {
              if (vs[i]!=null)
               {
                View lt = (View) vs[i];
                LayoutParams lp = (LayoutParams) lt.getLayoutParams();
                lp.topMargin = cfg.yscaled(this.TOP);
                lt.setLayoutParams(lp);
               }
             }            
          }
        public Integer getTOP() 
          {
            if (this.TOP < 1) {return 0;}
            return this.TOP;
          }                    
        public void setTag(Integer rwn, String nwt) 
          {
            if (rwn < 0) {return;}
            if (rwn > RowTag.length) {return;}          
            RowTag[rwn] = nwt;
          }
        public String getTag(Integer rwn) 
          {
            if (rwn < 0) {return "";}
            if (rwn > RowTag.length) {return "";}
            return RowTag[rwn];
          }
        public void removeallviews() 
          {
            for (int j=0; j<cfg.ctlstyl.length-1; j++) 
              {
               if (cfg.ctlstyl[j][27][0]==null) {continue;}
               if (cfg.ctlstyl[j][27][0]==iii) 
                { 
                 cfg.ctlid[j][0]   = 0;
                 cfg.ctlobj[j][0]  = null;
                 cfg.ctlname[j][0] = ""; 
                 cfg.ctlpar[j][0]  = 0;
                 cfg.ctltag[j][0]  = "";
                 cfg.ctlimg[j][0]  = "";
                 cfg.ctllong[j][0] = 0;
                 cfg.ctlfont[j][0] = "";
                 cfg.ctlfsiz[j][0] = 0;
                 cfg.ctlflgs[j][0] = 0;
                 cfg.ctlfc[j][0]   = 0;
                 cfg.ctlbc[j][0]   = null;                 
                 for (int k=0; k<cfg.ctlstyl[j].length; k++) {cfg.ctlstyl[j][k][0] = 0; cfg.ctlstyl[j][k][1] = 0;}
                }               
              }
          }   

        @Override
        public View getView(int position, View convertView, ViewGroup parent) 
          {
          
            if (RowRls[position] != null) 
                {
//Integer rr = position;                    
//Log.d("=================", "===========position=" + rr.toString());
//return RowRls[position];                
                }
            
                
            RowRls[position] = new RelativeLayout(map.this);                        
                               
            //if (!this.activated) {return listLayout;}
            //if (!this.activated) {return RowRls[position];}
            
           // if (!cfg.isformactive(cfg.ctlpar[iii][0])) {return listLayout;}
            
            //listLayout.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.WRAP_CONTENT, AbsListView.LayoutParams.WRAP_CONTENT));
            RowRls[position].setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.WRAP_CONTENT, AbsListView.LayoutParams.WRAP_CONTENT));

            //if (position>RowText.length) {return listLayout;}
            if (position>RowText.length) {return RowRls[position];}
            
            String[] cols = RowText[position].split("\t");            
            
            if (cfg.ctlcb[iii][0]<0)
              {
                DCC[] cb = {new DCC()};
                //cfg.scrl        = listLayout;
                cfg.scrl          = RowRls[position];
                cfg.llvid         = iii;
                cb[0].hwnd[0]     = -cfg.ctlpar[this.iii][0];
                cb[0].formname[0] = cfg.dlgname[cfg.ctlpar[iii][0]][0];
                cb[0].ctlid[0]    = cfg.ctlname[iii][0];
                cb[0].callback[0] = cfg.ctlcb[iii][0];
                cb[0].isctrl[0]   = true;
                cb[0].id[0]       = iii;
                cb[0].lparam[0]   = position;
                cb[0].wparam[0]   = this.iii;
                cb[0].x[0]        = 0;
                cb[0].y[0]        = position;
                cb[0].count[0]    = RowText.length;
                cb[0].msg[0]      = 493;
                //cb[0].rl[0]       = listLayout;
                cb[0].rl[0]       = RowRls[position];
                cb[0].text[0]     = RowText[position];
                boolean codeinsubclass = (_Dlgproc(cb, cb[0].callback[0])!=0);
                cfg.scrl       = null;
                cfg.llvid      = 0;
                //if (codeinsubclass) {return listLayout;}
                if (codeinsubclass) {return RowRls[position];}
              } 
            
                        
            for (int i = 0; i < cols.length; i++)
              {            
                TextView lt = new TextView(map.this);
                vs[position] = lt;
                lt.setId(5001+i);
                if (TextColor!=null) {lt.setTextColor(TextColor);}
                if (TextSize!=null) {lt.setTextSize(0, cfg.yscaled(TextSize));}
                if (TextStyle!=null) {lt.setGravity(TextStyle);}
                if (dFont!=null) {lt.setTypeface(dFont);}                
                if (i==0 && ico[position]!=0) {lt.setCompoundDrawablesWithIntrinsicBounds(ico[position], 0, 0, 0);}
                
                if (RowText!=null)
                  {
                    if ((TextStyle==null || TextStyle==0) && cols.length==1)
                     {
                       cols[i] += new String(new char[100]).replace("\0", " "); 
                     }
                  }
                if (i==0)
                  {
                  
                    if (RowHead[position])
                      {
                        lt.setBackgroundColor(this.HeadColor);
                      }
                    lt.setText(cols[i]);
                    //listLayout.addView(lt, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
                    RowRls[position].addView(lt, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
                  }
                else
                  {
                    lt.setText(cols[i] + " ");
                    RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams (LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
                    lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
                    //listLayout.addView(lt, lp);
                    RowRls[position].addView(lt, lp);
                  }
                 
                LayoutParams lp = (LayoutParams) lt.getLayoutParams();
                if (i==0 && RowHead[position])
                  {                    
                    if (this.RowHeight>0) {lp.height = cfg.yscaled(this.RowHeight-cfg.ctlstyl[this.iii][7][0]);}
                    lp.leftMargin = cfg.xscaled(cfg.ctlstyl[this.iii][7][0])-1;
                    lp.topMargin  = cfg.yscaled(cfg.ctlstyl[this.iii][7][0]);
                  }
                else
                  {  
                    if (this.RowHeight>0) {lp.height     = cfg.yscaled(this.RowHeight);}
                    if (this.LEFT>0)      {lp.leftMargin = cfg.xscaled(this.LEFT);} else {lp.leftMargin = cfg.xscaled(7);}
                    if (this.TOP>0)       {lp.topMargin  = cfg.yscaled(this.TOP);}                    
                  }
                
                lt.setLayoutParams(lp);
                
                if (i==1) 
                 {
                  if (cols.length>2)
                   {
                    Integer rid = getResources().getIdentifier(cols[2], "drawable", AppContext.getPackageName());
                    if (rid!=0)
                     {                                
                      Drawable imi  = getResources().getDrawable(rid);
                      if (imi!=null)
                       { 
                         Bitmap bitmap = ((BitmapDrawable) imi).getBitmap();
                         final Drawable img = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, cfg.xscaled(32), cfg.yscaled(32), true));
                         Integer pos = 2;
                         if (img!=null)
                          { 
                           if (cols.length>3) {pos = Integer.parseInt(cols[3]);}
                           if (pos<1 || pos>4) {pos = 2;}                                    
                                if (pos==1) {lt.setCompoundDrawablesWithIntrinsicBounds(null, img, null, null);}
                           else if (pos==2) {lt.setCompoundDrawablesWithIntrinsicBounds(null, null, img, null);}
                           else if (pos==3) {lt.setCompoundDrawablesWithIntrinsicBounds(null, null, null, img);}
                           else if (pos==4) {lt.setCompoundDrawablesWithIntrinsicBounds(img, null, null, null);}
                          }
                       }
                     }   
                   }
                  break;
                 }  
              }
                        
            //return listLayout;
            return RowRls[position];
         }
         
      }

      private boolean onmainui() {return (Looper.myLooper()==Looper.getMainLooper());}
      
      // This allows to use a number or a String as the control's id.
      private String controlid(Object cid)
       {
         if (cid==null) {return null;}
         if (cid instanceof String) {return ((String) cid).toLowerCase();}
         if (cid instanceof Integer) {return String.valueOf((Integer) cid);}
         if (cid instanceof Double) {return String.valueOf((Double) cid);}
         if (cid instanceof Number) {return String.valueOf(((Number) cid).intValue());}                  
         cfg.curcontrol++;
         return "control" + String.valueOf(cfg.curcontrol);
       }
               

      private Bitmap B2pdecodeFile(File f, Integer REQUIRED_SIZE) 
       {
        try {
        BitmapFactory.Options o = new BitmapFactory.Options();
        o.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(new FileInputStream(f), null, o);
        int scale = 1;
        while(o.outWidth / scale / 2 >= REQUIRED_SIZE && o.outHeight / scale / 2 >= REQUIRED_SIZE) {scale *= 2;}
        BitmapFactory.Options o2 = new BitmapFactory.Options();
        o2.inSampleSize = scale;
        return BitmapFactory.decodeStream(new FileInputStream(f), null, o2);
        } catch (Exception ee) {}
        return null;
       }
       
   public Bitmap pluribasicBorderedBitmap(Bitmap bmp, Integer w, Integer h, Integer rad, Integer lwd, Integer clr)
    {
      if (rad==null) {rad=0;}    
      if (lwd<1) {return bmp;}                    
      Bitmap output = Bitmap.createBitmap(w, h, Config.ARGB_8888);
      Canvas canvas = new Canvas(output);
      final Paint paint = new Paint();
      final Rect rect2  = new Rect(0, 0, w, h);
      final Rect rect1  = new Rect(0, 0, bmp.getWidth(), bmp.getHeight());
      final RectF rectF = new RectF(rect1);
      final RectF rectG = new RectF(rect2);
      paint.setAntiAlias(true);
      if (clr!=null) {paint.setColor(clr);}      
      if (lwd>0) {paint.setStrokeWidth((Integer)(int) (lwd*1.2));} else {paint.setStrokeWidth(1);}      
      canvas.drawRoundRect(rectG, rad, rad, paint);
      paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
      canvas.drawBitmap(bmp, rect1, rect2, paint);
      if (lwd>0) {paint.setStyle(Paint.Style.STROKE);} else {paint.setStyle(Paint.Style.FILL);}      
      canvas.drawRoundRect(rectG, rad, rad, paint);
      return output;         
    }
    
    private void GetViewWidthAndHeight(Button view, Integer cid, Integer[] w, Integer[] h)
     {
       RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) view.getLayoutParams();          
       if (cfg.isformsized(cfg.getctlparent(cid))) {w[0] = cfg.xredux(lp.width);h[0] = cfg.yredux(lp.height);} else {w[0] = lp.width+100; h[0] = lp.height+30;}         
     }

    private String getCustomClassName(String ccn)
     {
        try 
          {
            return ccn.substring(ccn.length()-14);
          }
        catch (Exception ee)
          {
            return "";
          }
     }
           

   class CustomEditText extends EditText
     {
       public CustomEditText(Context context) 
        {
         super(context);
        }
 
      @Override public boolean onKeyPreIme(int keyCode, KeyEvent event) 
        {           
          final Semaphore fse = new Semaphore(0, true);
          runOnUiThread(new Runnable() {@Override public void run() 
            {
              removeNavigationBar();
              fse.release(); return;
            }});
          try {fse.acquire();} catch (Exception e) {}            
          if (cfg.keyboardVis) 
           {                          
             cfg.keyboardVis = false;
             new Thread(new Runnable() {public void run() {cfg.sendmessage("*", 610, 2, 0);}}).start();
           }
         else
           {
             new Thread(new Runnable() {public void run() {cfg.sendmessage("*", 610, 100, 0);}}).start();
           }                      
         return false;
        }
     }     

          
private ArrayList<LatLng> plbDecodePoly(String encoded) 
  {
    ArrayList<LatLng> poly = new ArrayList<LatLng>();
    int index = 0, len = encoded.length();
    int lat = 0, lng = 0;

    while (index < len) {
        int b, shift = 0, result = 0;
        do {
            b = encoded.charAt(index++) - 63;
            result |= (b & 0x1f) << shift;
            shift += 5;
        } while (b >= 0x20);
        int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
        lat += dlat;

        shift = 0;
        result = 0;
        do {
            b = encoded.charAt(index++) - 63;
            result |= (b & 0x1f) << shift;
            shift += 5;
        } while (b >= 0x20);
        int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
        lng += dlng;
        LatLng p = new LatLng((((double) lat / 1E5)),(((double) lng / 1E5)));
        poly.add(p);
    }    
    return poly;
  }
  
private Bitmap plbGetRoundedCroppedBitmap(Bitmap bitmap) {
    int widthLight = bitmap.getWidth();
    int heightLight = bitmap.getHeight();
    
    Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(),
            Config.ARGB_8888);
        
    Canvas canvas = new Canvas(output);
    Paint paintColor = new Paint();
    paintColor.setFlags(Paint.ANTI_ALIAS_FLAG);
        
    RectF rectF = new RectF(new Rect(0, 0, widthLight, heightLight));
        
    canvas.drawRoundRect(rectF, widthLight / 2, heightLight / 2, paintColor);
        
    Paint paintImage = new Paint();
    paintImage.setXfermode(new PorterDuffXfermode(Mode.SRC_ATOP));
    canvas.drawBitmap(bitmap, 0, 0, paintImage);
        
    return output;
}
    //Ends code from extension 'ALL_REQUIRED_FUNCS.bin' (Mainapp)

    //Starts code from extension 'MYSQL_CONNECT.bin' (Mainapp)

    // Connects to a database. 
    public void MySQL_Connect(String usr, String pwd, String dbn, String hst)//0
      {      
        if (DBconn!=null) {return;}  
        SQLiteDatabase mydb = openOrCreateDatabase(dbn.trim().toLowerCase(), 0, null);
        DBconn = mydb;
      }
    //Ends code from extension 'MYSQL_CONNECT.bin' (Mainapp)

    //Starts code from extension 'CONTROLKILL.bin' (Mainapp)

    // Remove a control from a layout. 
    public void ControlKill(Integer fid, final Object id, int[] err, int[] erl, Integer er1, int[] rel, Integer re1)//0
      {
        if (cfg==null) {return;}
        if (fid<0) {fid=-fid;}        
        final int k = cfg.getctlid(fid, controlid(id));
        final int i = cfg.getctlparent(k);
        if (k<1) {return;}
        final Semaphore fse = new Semaphore(0, true);
        final Runnable trc = new Runnable() 
         {
          @Override
          public void run()      
           {           
              //RelativeLayout rl = (RelativeLayout) cfg.dlghndl[i][0];
              //if (rl==null) {fse.release(); return;}               
              //View vv = (View) rl.findViewById(k);
              View vv = (View) cfg.ctlobj[k][0];
              if(vv==null) {fse.release(); return;}
              
              try {
                            
              RelativeLayout rl = (RelativeLayout) vv.getParent();
              
              if (vv instanceof Button)
                {
                  Button v = (Button) vv;
                  v.setId(98182);
                  rl.removeView(v);
                }
              else if (vv instanceof CheckBox)
                {
                  CheckBox v = (CheckBox) vv;
                  v.setId(98182);
                  rl.removeView(v);
                }
              else if (vv instanceof EditText)
                {
                  EditText v = (EditText) vv;
                  v.setId(98182);
                  rl.removeView(v);
                }
              else if (vv instanceof RadioButton)
                {
                  RadioButton v = (RadioButton) vv;
                  v.setId(98182);
                  rl.removeView(v);
                }
              else if (vv instanceof ImageView)
                {
                  ImageView v = (ImageView) vv;
                  v.setId(98182);
                  rl.removeView(v);
                }
              else if (cfg.ctlstyl[k][28][0]==89) // camera controls
                {  
                                    
                }                
              else if (vv instanceof SurfaceView)
                {
                  SurfaceView v = (SurfaceView) vv;
                  v.setId(98182);
                  v.setVisibility(View.GONE);
                  rl.removeView(v);
                }
              else if (vv instanceof ListView)
                {
                  ListView v = (ListView) vv;
                  v.setId(98182);
                  v.setVisibility(View.GONE);
                  rl.removeView(v);
                  for (int ii=9; ii<cfg.ctlstyl.length; ii++)
                   {
                    if (cfg.ctlstyl[ii][27][0]==i)
                     {
                       cfg.resetctl(ii);                         
                     }
                   }
                }
              else if (cfg.ctlstyl[k][28][0]==82) // webvide controls
                {
                  
                }                
              else
                {
                  vv.setId(98182);
                  rl.removeView(vv);
                }

              for (int ii=9; ii<cfg.ctlstyl[0].length; ii++) {cfg.ctlstyl[k][ii][0]=0;} // Reset the values.
              
              } catch (Exception e89) {}  
                                                                                                              
              fse.release();
            }
         };
         
         if (onmainui()) {trc.run();} else {runOnUiThread(trc); try {fse.acquire();} catch (InterruptedException exx) { }}
         cfg.resetctl(k);
      }
    //Ends code from extension 'CONTROLKILL.bin' (Mainapp)

    //Starts code from extension 'DIALOGEND.bin' (Mainapp)

    // Terminates a dialog. 
    public void DialogEnd(Integer Dnm, final int[] err, final int[] erl, final Integer er1, final int[] rel, final Integer re1)//0
      {
        if (Dnm==null || Dnm==0) {SetSysError(610, err, erl, er1, rel, re1); return;}
        if (cfg==null) {SetSysError(611, err, erl, er1, rel, re1); return;}
        final Integer[] rv = {0};
        final Integer[] ndf = {-1};
        final Integer i = Dnm;
        if (i<1) {SetSysError(610, err, erl, er1, rel, re1); return;}
        if (i>cfg.dlgname.length) {SetSysError(610, err, erl, er1, rel, re1); return;}
        final String dnm = cfg.dlgname[i][0].toLowerCase().trim();        
        if (cfg.dlgints[i][31]==null) {cfg.dlgints[i][31] = 0;}
        if (cfg.dlgints[i][31] != 1000) {SetSysError(636, err, erl, er1, rel, re1); return;}
       
        DCC[] c = {new DCC()};                            
        c[0].formname[0]= cfg.dlgname[i][0];
        c[0].hwnd[0]    = i;
        c[0].ctlid[0]   = "";                                  
        c[0].callback[0]= cfg.dlgcb[i][0];
        c[0].id[0]      = i;
        c[0].ctype[0]   = 9;
        c[0].msg[0]     = WM_DESTROY;
        c[0].lparam[0]  = 0;
        c[0].wparam[0]  = 0;
        c[0].widget[0]  = "dialog";
        _Dlgproc(c, c[0].callback[0]);

        final Semaphore fse = new Semaphore(0, true);        
        runOnUiThread(new Runnable()
            {
              public void run()//0
               {
                 cfg.keyboardVis = false;
                 hidekeyboard();
                 removeNavigationBar(); // only if configured to do so.
                 
                 if (dnm.equals("")) {rv[0] = 1; fse.release(); return;}                 

                 RelativeLayout rl = null;
                 LinearLayout ll = null;
                 
                 if (cfg.dlghndl[i][0] instanceof RelativeLayout) {rl = (RelativeLayout) cfg.dlghndl[i][0];}                                                   
                 if (cfg.dlghndl[i][0] instanceof LinearLayout) {ll = (LinearLayout) cfg.dlghndl[i][0];}
                                    
                 rv[0] = 0;
                 
                 // kill child controls.
                 for (int k = 0; k<cfg.ctlpar.length-1; k++)
                   {                    
                     if (cfg.ctlpar[k][0]==i)
                       {
                         for (int c = 9; c<(cfg.ctlpar.length-1); c++)
                           {
                              if (cfg.ctlstyl[c][27][0]==null) {continue;}
                              if (cfg.ctlstyl[c][27][0]==k) {cfg.resetctl(c);}  //erase listview controls.
                           }
                         if (cfg.ctlstyl[k][28][0]==89) // camera controls
                           {
                              ControlKill(i, k, err, erl, er1, rel, re1);
                              continue;                            
                           }                          
                         else if (cfg.ctlstyl[k][28][0]==82) // webvideo controls
                           {
                              ControlKill(i, k, err, erl, er1, rel, re1);
                              continue;
                              //
                           }
                         else if (cfg.ctlstyl[k][28][0]==25) // graphic controls
                           {
                             if (cfg.dlgcnvs[k][0] instanceof CanvasView)
                               {                           
                                 CanvasView cv = (CanvasView) cfg.dlgcnvs[k][0];
                                 if (cv!=null)
                                   {
                                     cv.running = false;
                                   }
                               }
                           }                      
                         View v = null;                         
                         if (rl!=null) {v = (View) rl.findViewById(cfg.ctlid[k][0]); if (v!=null) {v.setId(98182); rl.removeView(v);}}
                         if (ll!=null) {v = (View) ll.findViewById(cfg.ctlid[k][0]); if (v!=null) {v.setId(98182); ll.removeView(v);}}
                       }
                   }
                   
                 // kill child dialogs.                

                //Log.d("========================A=", String.valueOf(i));                                       
                                       
                 for (int k = 0; k<cfg.dlghpar.length-1; k++)
                   {                    
                     if (k!=i) 
                       {
                         if (cfg.dlghpar[k][0]==i)
                           {
                             if (cfg.dlghndl[k][0] instanceof RelativeLayout || cfg.dlghndl[k][0] instanceof LinearLayout) 
                               {
                                 //Log.d("========================B=", String.valueOf(k));
                                 DialogEnd(k, err, erl, er1, rel, re1);                           
                               }
                           }
                       }                           
                   }                   
                 
                 Integer idp = cfg.dlghpar[i][0];
                 RelativeLayout dp = null;
                 RelativeLayout dl = null;
                 
                 if (cfg.dlghndl[idp][0] instanceof RelativeLayout) {dp = (RelativeLayout) cfg.dlghndl[idp][0];}
                 if (cfg.dlghndl[idp][0] instanceof LinearLayout) {dl = (RelativeLayout) cfg.dlghndl[idp][0];}
                 
                 ndf[0] = cfg.dlghpar[i][0];
                 if (ndf[0]==null) {ndf[0] = -1;}
                 
                 if (idp!=0 && (dp!=null || dl!=null)) // Look for other popup dialogs...
                   {                                          
                     for (int k = cfg.dlghpar.length-1; k>0; k--)
                       {
                         if ((cfg.dlghpar[k][0]).equals(ndf[0]) && !i.equals(k))
                           {
                             if ((cfg.dlgints[k][4] & 4) == 4)
                               {
                                 if (cfg.dlgstyl[k][34][0]==0) // if is visible, focus it.
                                   {
                                     ndf[0] = k;
                                     break;
                                   }
                               }
                           }
                       }
                   } 
                                    
                 if (((cfg.dlgints[i][4] & 1073741824) != 1073741824) && ((cfg.dlgints[i][4] & 4) != 4))
                   {                 
                     if (ndf[0]!=-1) 
                       {
                         if (cfg.dlgdisp==i)
                           {
                             RelativeLayout dp2 = null;
                             RelativeLayout dl2 = null;
                             if (cfg.dlghndl[ndf[0]][0] instanceof RelativeLayout) {dp2 = (RelativeLayout) cfg.dlghndl[ndf[0]][0];}
                             if (cfg.dlghndl[ndf[0]][0] instanceof LinearLayout) {dl2 = (RelativeLayout) cfg.dlghndl[ndf[0]][0];}                                            
                             if (dp2!=null || dl2!=null) 
                               {      
                                  cfg.setformactive(ndf[0]);
                                  cfg.dlgdisp = ndf[0];
                                  try {if (dp2!=null) {setContentView(dp2);}} catch (Exception ee1) {}
                                  try {if (dl2!=null) {setContentView(dl2);}} catch (Exception ee1) {}                                  
                               }
                           }
                       }
                   }
                 else if ((cfg.dlgints[i][4] & 4) == 4)
                   {  
                     if (dp!=null || dl!=null)
                       {
                         View fd = null;
                         if (dp!=null) {fd = (View) dp.findViewById(20000+i);}
                         if (dl!=null) {fd = (View) dl.findViewById(20000+i);}
                         if (idp!=0 && (fd!=null || dl!=null))
                           {
                             if (dp!=null) {dp.removeView(fd);}
                             if (dl!=null) {dl.removeView(fd);}
                           }
                           
                       }                       
                   }
                   
                 if (ndf[0]!=null && ndf[0]>0)
                   {   
                     cfg.setformactive(ndf[0]);
                     cfg.dlgdisp = ndf[0];                         
                   }
                 else
                   {
                     //no hay dialogo para enfocar!!!
                   }
                     
                 cfg.delcontrols(i);
                 cfg.dlghpar[i][0]  = 0;                  
                 cfg.dlgpar[i][0]   = "";                  
//cfg.dlghndl[i][0]  = null;
                 
                 if (cfg.dlgcnvs[i][0] instanceof CanvasView)
                    {
                        CanvasView cvx = (CanvasView) cfg.dlgcnvs[i][0];
                        if (cvx != null)
                           {
                              cvx.running = false;
                           }
                    }
                 
                 cfg.dlgcnvs[i][0]  = null;      
                 cfg.dlgcapt[i][0]  = "";
                 cfg.dlgtext[i][0]  = "";
                 cfg.dlguser[i][0]  = 0;
                 cfg.dlgtext[i][0]  = "";
//cfg.dlgname[i][0]  = "";
                 cfg.dlgfont[i][0]  = "";
                 cfg.dlgfcol[i][0]  = 0;
                 cfg.dlgbcol[i][0]  = 0;
                 cfg.dlgfsiz[i][0]  = 0;           
                 cfg.dlgflgs[i][0]  = 0; 
                 cfg.dlgints[i][34] = 0;
                 for (int j = 0; j < 35; j++) {cfg.dlgints[i][j] = 0;}
                 for (int j = 0; j < 35; j++) {cfg.dlgstyl[i][j][0] = null;}
                 cfg.dlgcrts[i][0] = 0;
                 cfg.dlgints[i][24] = null;
                 
                 if(rl!=null) 
                  {
                     if (i==92) {rl.setVisibility(View.INVISIBLE);}
                     else {rl.setId(0); rl.setVisibility(View.GONE); cfg.dlghndl[i][0] = null; try {((ViewGroup)rl.getParent()).removeView(rl);} catch (Exception e) {}}
                  }
                 else if (ll!=null)
                  {
                     if (i==92) {ll.setVisibility(View.INVISIBLE);}
                     else {ll.setId(0); ll.setVisibility(View.GONE); cfg.dlghndl[i][0] = null; try {((ViewGroup)ll.getParent()).removeView(ll);} catch (Exception e) {}}
                  }    
                 
                 if (idp!=0) 
                   {                     
                     if (dp!=null) {dp.removeView(rl);}
                     if (dl!=null) {dl.removeView(rl);}
                   }                 
                 rl = null;
                            //Do not remove!
                 cfg.dlgname[i][0] = ""; // Do it at last!!
                 
                 //Log.d("=========================", "DONE");
                                                   
                 fse.release();                 
               }               
            });
        try {fse.acquire();} catch (Exception e) {}

        if (rv[0]>0) {SetSysError(643+rv[0], err, erl, er1, rel, re1);} else {cfg.setformactive(ndf[0]); cfg.ondisplay(ndf[0]);}
        
      }
    //Ends code from extension 'DIALOGEND.bin' (Mainapp)

    //Starts code from extension 'CONTROLSETCOLOR.bin' (Mainapp)

    // Sets the control's colors. 
    public void ControlSetColor(Integer fid, final Object id, final Integer fc, final Integer bc, final Integer bdc, int[] err, int[] erl, Integer er1, int[] rel, Integer re1)//0
      {                 
        final boolean[] lvl = {false};
        if (fid<1) {fid=-fid; lvl[0] = true;}
        final Integer[] cid = {cfg.getctlid(fid, controlid(id))};        
        if (cid[0]<10) 
          {
            try {cid[0] = Integer.parseInt(controlid(id));} catch (Exception ee) {}          
          }
        if (cid[0]<10 || cid[0]>cfg.ctlobj.length) {SetSysError(272, err, erl, er1, rel, re1); return;}
        final Integer[] oe = {0};
        if (fc==null) {SetSysError(572, err, erl, er1, rel, re1); return;}
        if (bc==null) {SetSysError(573, err, erl, er1, rel, re1); return;}
        cfg.setctlcolor(cid[0], fc, bc);
        if (cfg.ctlfc[cid[0]][0]==null) {cfg.ctlfc[cid[0]][0] = fc;}
        if (cfg.ctlbc[cid[0]][0]==null) {cfg.ctlbc[cid[0]][0] = bc;}        
        if (bdc!=null && bdc!=0) 
          { 
            cfg.ctlstyl[cid[0]][7][1] = bdc;
           // if (cfg.ctlstyl[cid[0]][7][2]==null) {cfg.ctlstyl[cid[0]][7][2] = bdc;}
            
            //Log.d("======================bdc1", "----" + String.valueOf(bdc));            
            //Log.d("======================bdc2", "----" + String.valueOf(cfg.ctlstyl[cid[0]][7][1]));            

          }
        final Semaphore fse = new Semaphore(0, true);
        final Runnable trc = new Runnable() 
         {
          @Override
          public void run()      
           {
              View view = (View) cfg.ctlobj[cid[0]][0];
              if(view==null) {oe[0]=434;fse.release(); return;}
              String wt = view.getClass().getName().toLowerCase();
              if (wt.equals("android.widget.edittext") || (getCustomClassName(wt)).equals("customedittext"))
                {
                  EditText v = (EditText) view;
                  
                  if (fc!=null) {v.setTextColor(fc);}
                  
                  GradientDrawable sh = new GradientDrawable(); 
                  if (cfg.ctlstyl[cid[0]][7][0]>0) {sh.setStroke(cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);} 
                  if (cfg.ctlstyl[cid[0]][1][0]!=0) {sh.setCornerRadius(cfg.ctlstyl[cid[0]][1][0]);} 
                  sh.setColor(bc); 
if (accver(30002)) // Start version check
  {
                  v.setBackgroundDrawable(sh);                                    
                  v.getBackground().setColorFilter(bc, PorterDuff.Mode.DST);
  } // End version check
                }
              else if (wt.equals("android.widget.button"))
                {
                  Button v = (Button) view;
                  if (fc!=null) {v.setTextColor(fc);}                  
                  if (cfg.ctlbmp[cid[0]][0]!=null)
                   {
                    Integer[] w = {0};
                    Integer[] h = {0};
                    GetViewWidthAndHeight(v, cid[0], w, h);                    
                    Bitmap output = pluribasicBorderedBitmap((Bitmap) cfg.ctlbmp[cid[0]][0], w[0], h[0], cfg.ctlstyl[cid[0]][1][0], cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);   
                    v.setBackgroundDrawable(new BitmapDrawable(output));
                   }
                  else
                   {
                    GradientDrawable sh = new GradientDrawable(); 
                    if (cfg.ctlstyl[cid[0]][7][0]>0) {sh.setStroke(cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);}                                 
                    if (cfg.ctlstyl[cid[0]][1][0]!=0) {sh.setCornerRadius(cfg.ctlstyl[cid[0]][1][0]);}
                    if (bc!=null) 
                      {
                       sh.setColor(bc);
if (accver(30002)) // Start version check
  {
                       v.setBackgroundDrawable(sh); v.getBackground().setColorFilter(bc, PorterDuff.Mode.DST);
  } // End version check
                      }
                   }
                }
              else if (wt.equals("android.widget.spinner"))
                {
                  Spinner v = (Spinner) view;
                  TextView t = (TextView) v.getChildAt(0);
                  if (t!=null) {t.setTextColor(fc);}
                                    
                  GradientDrawable sh = new GradientDrawable(); 
                  if (cfg.ctlstyl[cid[0]][7][0]>0) {sh.setStroke(cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);} 
                  if (cfg.ctlstyl[cid[0]][1][0]!=0) {sh.setCornerRadius(cfg.ctlstyl[cid[0]][1][0]);}
                                    
                  if (bc!=null) 
                    {
                       sh.setColor(bc);
if (accver(30002)) // Start version check
  {
                       v.setBackgroundDrawable(sh); v.getBackground().setColorFilter(bc, PorterDuff.Mode.DST);
  } // End version check
                    }
                }    
              else if (wt.equals("android.widget.progressbar"))
                {
                  ProgressBar v = (ProgressBar) view;
                  if (bc!=null) 
                    {
                        v.getIndeterminateDrawable().setColorFilter(bc, android.graphics.PorterDuff.Mode.MULTIPLY);
                    }                  
                }                                
              else if (wt.equals("android.widget.listview"))
                {
                  ListView v = (ListView) view;
                  if (fc!=null) 
                    {
                      customListviewAdapter ca = (customListviewAdapter) v.getAdapter();
                      if (ca!=null) {ca.setFontColor(fc);}
                    }
                  GradientDrawable sh = new GradientDrawable(); 
                  if (cfg.ctlstyl[cid[0]][7][0]>0) {sh.setStroke(cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);} 
                  if (cfg.ctlstyl[cid[0]][1][0]!=0) {sh.setCornerRadius(cfg.ctlstyl[cid[0]][1][0]);}
                  if (bc!=null) 
                   { 
                    sh.setColor(bc);
if (accver(30002)) // Start version check
  {
                    v.setBackgroundDrawable(sh);
                    v.getBackground().setColorFilter(bc, PorterDuff.Mode.DST);
  } // End version check
                    v.setCacheColorHint(bc);
                   }
                }                
              else if (wt.equals("android.widget.textview"))
                {
                  TextView v = (TextView) view;
                  if (fc!=null) {v.setTextColor(fc);}                  
                  GradientDrawable sh = new GradientDrawable(); 
                  if (cfg.ctlstyl[cid[0]][7][0]>0) {sh.setStroke(cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);} 
                  if (cfg.ctlstyl[cid[0]][1][0]!=0) {sh.setCornerRadius(cfg.ctlstyl[cid[0]][1][0]);}                  
                  if (bc!=null) {sh.setColor(bc);}
if (accver(30002)) // Start version check
  {
                  v.setBackgroundDrawable(sh);
  } // End version check
                }
              else if (wt.equals("android.widget.checkbox"))
                {
                  CheckBox v = (CheckBox) view;
                  if (fc!=null) {v.setTextColor(fc);}
//if (cfg.ctlstyl[cid[0]][10]!=0) {GradientDrawable sh = new GradientDrawable(); sh.setCornerRadius(cfg.ctlstyl[cid[0]][10]); sh.setColor(bc); v.setBackgroundDrawable(sh);}
                  GradientDrawable sh = new GradientDrawable(); 
                  if (cfg.ctlstyl[cid[0]][7][0]>0) {sh.setStroke(cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);} 
                  if (cfg.ctlstyl[cid[0]][1][0]!=0) {sh.setCornerRadius(cfg.ctlstyl[cid[0]][1][0]);}
                  if (bc!=null) 
                   { 
                    sh.setColor(bc);
if (accver(30002)) // Start version check
  {
                    v.setBackgroundDrawable(sh);
                    v.getBackground().setColorFilter(bc, PorterDuff.Mode.DST);
  } // End version check
                   }                   
                }
              else if (wt.equals("android.widget.radiobutton"))
                {
                  RadioButton v = (RadioButton) view;
                  if (fc!=null) {v.setTextColor(fc);}
                  GradientDrawable sh = new GradientDrawable(); 
                  if (cfg.ctlstyl[cid[0]][7][0]>0) {sh.setStroke(cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);} 
                  if (cfg.ctlstyl[cid[0]][1][0]!=0) {sh.setCornerRadius(cfg.ctlstyl[cid[0]][1][0]);} 
                  if (bc!=null) 
                   { 
                    sh.setColor(bc);
if (accver(30002)) // Start version check
  {
                    v.setBackgroundDrawable(sh);
                    v.getBackground().setColorFilter(bc, PorterDuff.Mode.DST);
  } // End version check
                   }                            
                }
              else if (view instanceof SurfaceView)
                {
                  SurfaceView v = (SurfaceView) view;
                  //if (fc==null) {v.setTextColor(dfc);} else {if (fc!=null) {v.setTextColor(fc);}}
if (accver(30002)) // Start version check
  {
                  if (bc!=null) {v.setBackgroundColor(bc);}
  } // End version check
                }            
              else if (view instanceof ImageView)
                {
                  ImageView v = (ImageView) view;
                  //if (fc==null) {v.setTextColor(dfc);} else {if (fc!=null) {v.setTextColor(fc);}}
if (accver(30002)) // Start version check
  {
                  if (bc!=null) {v.setBackgroundColor(bc);}
  } // End version check
                }  
              else
                {
                   String cp[] = {""}; 
                   try 
                     {
                       cp = wt.split("[$]", -1);
                       customControlSetColor(view, cp[cp.length-1], fc, bc);                   
                     } catch (Exception e) {oe[0] = 1022; return;}
                            
                        
                }                              
              cfg.setctlcolor(cid[0], fc, bc);
              fse.release();
              return;
           }
         };
        if (cfg.onmainui()) {trc.run();} else {runOnUiThread(trc); try {fse.acquire();} catch (InterruptedException e) { }}
        if (oe[0]!=0) {SetSysError(oe[0], err, erl, er1, rel, re1); return;}   
      }
    //Ends code from extension 'CONTROLSETCOLOR.bin' (Mainapp)

    //Starts code from extension 'CONTROLSETSTYLE.bin' (Mainapp)


    // Sets the control styles.
    public void ControlSetStyle(Integer fid, final Object id, final Integer stl, final Integer prm, final Integer pr2, final Integer pr3, int[] err, int[] erl, Integer er1, int[] rel, Integer re1)//0
      { 
      
        if (fid<1) {fid=-fid;}
        final Integer[] cid = {cfg.getctlid(fid, controlid(id))};
        if (cid[0]<10) 
          {
            try {cid[0] = Integer.parseInt(controlid(id));} catch (Exception ee) {}          
          }        
        if (cid[0]<10 || cid[0]>cfg.ctlobj.length) {SetSysError(272, err, erl, er1, rel, re1); return;}
        final Integer[] pm1 = {0};
        final Integer[] pm2 = {0};
        final Integer[] rs  = {-1};
        
        
        if (stl==9) 
          {
            //if (pr3!=null && pr3!=0) {cfg.ctlstyl[cid[0]][7][1] = pr3;}
            //if (pr3!=null && pr3!=0) {cfg.ctlstyl[cid[0]][7][2] = pr3;}
            ControlSetColor(fid, id, prm, pr2, pr3, err, erl, er1, rel, re1); 
            return;            
          }
        if (stl==16) 
          {
            cfg.ctlfc[cid[0]][1] = prm;
            if (pr2!=null && pr2!=0) {cfg.ctlbc[cid[0]][1] = pr2;}
            if (pr3!=null && pr3!=0) {cfg.ctlstyl[cid[0]][7][2] = pr3;}
            return;
          }
        
        final Semaphore fse = new Semaphore(0, true);
        final Runnable trc = new Runnable() 
         {
           @Override
           public void run()      
            {
              try {  
              RelativeLayout rl = (RelativeLayout) cfg.dlghndl[cfg.getctlparent(cid[0])][0];
              if (rl==null) {fse.release(); return;}
              View view = (View) cfg.ctlobj[cid[0]][0];
              
              if(view==null) {fse.release(); return;}
              cfg.getctlcolor(cid[0], pm1, pm2);
              
                   if (stl==1)  
                    {cfg.ctlstyl[cid[0]][1][0] = cfg.yscaled(prm);
                     cfg.ctlstyl[cid[0]][1][1] = pr2;
                     cfg.ctlstyl[cid[0]][1][2] = pr3;}
              else if (stl==7)  {cfg.ctlstyl[cid[0]][7][0] = cfg.yscaled(prm); cfg.ctlstyl[cid[0]][7][1] = pr2;}
              else if (stl==15)
               {
                if (prm==1)
                  {
                    view.bringToFront();
                    rl.invalidate();                      
                  }
                cfg.ctlstyl[cid[0]][stl][0] = prm;
                cfg.ctlstyl[cid[0]][stl][1] = pr2;
                cfg.ctlstyl[cid[0]][stl][2] = pr3;                  
                fse.release(); return;
               }
              else if (stl==10) 
               {
                if ((prm & 134217728)==134217728) {view.setEnabled(false);}
                cfg.ctlstyl[cid[0]][stl][0] = prm;
                cfg.ctlstyl[cid[0]][stl][1] = pr2;
                cfg.ctlstyl[cid[0]][stl][2] = pr3;                
               }
              else
               {
                cfg.ctlstyl[cid[0]][stl][0] = prm;
                cfg.ctlstyl[cid[0]][stl][1] = pr2;                
                cfg.ctlstyl[cid[0]][stl][2] = pr3;                
               }
               
              String wt = view.getClass().getName().toLowerCase();
              
              if (wt.equals("android.widget.imageview"))
                {
                  ImageView tc = (ImageView) view;
                  if (stl==13) {tc.setAlpha(prm);}                  
                                  
                }
              else if (getCustomClassName(wt).equals("$plbcameraview"))
                {                
                
                }
              else if (wt.equals("android.widget.edittext") || (getCustomClassName(wt)).equals("customedittext"))
                {                
                  EditText tc = (EditText) view;
                  if (stl==5) {tc.setGravity(prm);} 
                  if (stl==12) {pluribasicSetViewMargins(tc, cid[0], prm, pr2);}
                  if (stl==8) {
                    Integer prn = prm;                  
                    if ((prn & InputType.TYPE_TEXT_FLAG_IME_MULTI_LINE)==InputType.TYPE_TEXT_FLAG_IME_MULTI_LINE)
                     {
                      prn = (prn & ~ InputType.TYPE_TEXT_FLAG_MULTI_LINE);
                      tc.setSingleLine();
                      tc.setMaxLines(1);
                     }
                    if ((prn & InputType.TYPE_TEXT_VARIATION_PASSWORD)==InputType.TYPE_TEXT_VARIATION_PASSWORD)
                     {
                      tc.setEllipsize(TruncateAt.END);
                      prn = (prn & ~ InputType.TYPE_TEXT_FLAG_MULTI_LINE) | InputType.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                      tc.setSingleLine();
                      tc.setMaxLines(1);
                      tc.setTransformationMethod(PasswordTransformationMethod.getInstance());
                     }
                    else if ((prn & InputType.TYPE_TEXT_FLAG_MULTI_LINE)==InputType.TYPE_TEXT_FLAG_MULTI_LINE)
                     {
                      prn = (prn & ~ InputType.TYPE_TEXT_FLAG_IME_MULTI_LINE) | InputType.TYPE_TEXT_FLAG_MULTI_LINE;
                      tc.setSingleLine(false);
                      tc.setMaxLines(Integer.MAX_VALUE);
                      tc.setImeOptions(EditorInfo.IME_FLAG_NO_ENTER_ACTION);
                     }
                    tc.setInputType(prn);
                    cfg.ctlstyl[cid[0]][8][0] = prn;
                   }
                  if (stl==10) 
                   {
                    Integer cio = 0;
                         if ((prm & 1073741824)==1073741824) { } 
                    else if ((prm & 65536)==65536) {tc.setImeOptions(EditorInfo.IME_ACTION_NEXT); 
                    if ((prm & 67108864)==67108864) {tc.setImeOptions(EditorInfo.IME_FLAG_NAVIGATE_NEXT);}}
                    if ((pr2 & 4)==4) {tc.setSingleLine(false); tc.setImeOptions(EditorInfo.TYPE_TEXT_FLAG_MULTI_LINE);}
                    //if (cio!=0) {tc.setImeOptions(cio);}
                   }
                  if (stl==11) 
                   {                  
                    tc.setFilters(new InputFilter[] {new InputFilter.LengthFilter(prm)});
                   }                                      
                  if (stl==7 || stl==1)
                    {
                      GradientDrawable sh = new GradientDrawable(); 
                      if (cfg.ctlstyl[cid[0]][7][0]>0) {sh.setStroke(cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);}
                      if (cfg.ctlstyl[cid[0]][1][0]!=0) {sh.setCornerRadius(cfg.ctlstyl[cid[0]][1][0]);} 
                      sh.setColor(pm2[0]); 
if (accver(30002)) // Start version check
  {
                      tc.setBackgroundDrawable(sh);
                      tc.getBackground().setColorFilter(pm2[0],PorterDuff.Mode.DST);
  } // End version check
                    }
                } 
              else if (wt.equals("android.widget.button")) 
                {
                  Button tc = (Button) view;
                  if (stl==5) {tc.setGravity(prm);}
                  if (stl==12) {pluribasicSetViewMargins(tc, cid[0], prm, pr2);}
                  if (stl==7 || stl==1)
                    {
                      if (cfg.ctlbmp[cid[0]][0]!=null)
                       {
                        Integer[] w = {0};
                        Integer[] h = {0};
                        GetViewWidthAndHeight(tc, cid[0], w, h);                    
                        Bitmap output = pluribasicBorderedBitmap((Bitmap) cfg.ctlbmp[cid[0]][0], w[0], h[0], cfg.ctlstyl[cid[0]][1][0], cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);   
                        tc.setBackgroundDrawable(new BitmapDrawable(output));
                       }
                      else
                       {                   
                        GradientDrawable sh = new GradientDrawable(); 
                        if (cfg.ctlstyl[cid[0]][7][0]>0) {sh.setStroke(cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);}
                        
//Log.d("=======================color a===", String.valueOf(cid[0]));
//Log.d("=======================color 1===", String.valueOf(cfg.ctlstyl[cid[0]][7][1]));                        
                         
                        if (cfg.ctlstyl[cid[0]][1][0]!=0) {sh.setCornerRadius(cfg.ctlstyl[cid[0]][1][0]);} 
                        sh.setColor(pm2[0]); 
if (accver(30002)) // Start version check
  {
                        tc.setBackgroundDrawable(sh);
                        tc.getBackground().setColorFilter(pm2[0],PorterDuff.Mode.DST);
  } // End version check
                        
                       } 
                    }
               }
              else if (wt.equals("android.widget.spinner")) 
                {
                  Spinner tc = (Spinner) view;
                  if (stl==5) {tc.setGravity(prm);}
                  if (stl==7 || stl==1)
                    {
                      GradientDrawable sh = new GradientDrawable(); 
                      if (cfg.ctlstyl[cid[0]][7][0]>0) {sh.setStroke(cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);} 
                      if (cfg.ctlstyl[cid[0]][1][0]!=0) {sh.setCornerRadius(cfg.ctlstyl[cid[0]][1][0]);} 
                      sh.setColor(pm2[0]); 
if (accver(30002)) // Start version check
  {
                      tc.setBackgroundDrawable(sh);
                      tc.getBackground().setColorFilter(pm2[0],PorterDuff.Mode.DST);
  } // End version check
                    }
               }               
              else if (wt.equals("android.widget.textview")) 
               {
                 TextView tc = (TextView) view; 
                 if (stl==5) {tc.setGravity(prm);}
                 if (stl==12) {pluribasicSetViewMargins(tc, cid[0], prm, pr2);}
                 if (stl==7 || stl==1)
                    {
                      GradientDrawable sh = new GradientDrawable(); 
                      if (cfg.ctlstyl[cid[0]][7][0]>0) {sh.setStroke(cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);}
                      
                      if (cfg.ctlstyl[cid[0]][1][0]!=0) {sh.setCornerRadius(cfg.ctlstyl[cid[0]][1][0]);}
                      sh.setColor(pm2[0]);

if (accver(30002)) // Start version check
  {
                      tc.setBackgroundDrawable(sh);
                      tc.getBackground().setColorFilter(pm2[0],PorterDuff.Mode.DST);
  } // End version check
                    }
               }
              else if (wt.equals("android.widget.listview")) 
               {
                 ListView tc = (ListView) view; 
                       if (stl==12) {pluribasicSetViewMargins(tc, cid[0], prm, pr2);}
                  else if (stl==7 || stl==1)
                    {
                      GradientDrawable sh = new GradientDrawable(); 
                      if (cfg.ctlstyl[cid[0]][7][0]>0) {sh.setStroke(cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);} 
                      if (cfg.ctlstyl[cid[0]][1][0]!=0) {sh.setCornerRadius(cfg.ctlstyl[cid[0]][1][0]);} 
                      sh.setColor(pm2[0]); 
                      try {tc.setBackgroundDrawable(sh);} catch (Exception ee) {} 
                      tc.getBackground().setColorFilter(pm2[0],PorterDuff.Mode.DST);
                    }
                  else if (stl==2) {customListviewAdapter ca = (customListviewAdapter) tc.getAdapter(); ca.setHeight(prm);}
                  else if (stl==3) {customListviewAdapter ca = (customListviewAdapter) tc.getAdapter(); ca.setTOP(prm);}
                  else if (stl==4) {customListviewAdapter ca = (customListviewAdapter) tc.getAdapter(); ca.setLEFT(prm);}
                  else if (stl==18) {
                      customListviewAdapter ca = (customListviewAdapter) tc.getAdapter();
                      if (ca!=null)  {ca.setSepColor(pr2);}                   
                      if (ca!=null)  {ca.setSepSize(prm);}                    
                    }                  
                  else {customListviewAdapter ca = (customListviewAdapter) tc.getAdapter(); ca.setCtlStyle(stl);}
               }                    
              else if (wt.equals("android.widget.checkbox")) 
               {
                 CheckBox tc = (CheckBox) view;
                 if (stl==5) {tc.setGravity(prm);}   
                 if (stl==7 || stl==1)
                    {
                      GradientDrawable sh = new GradientDrawable(); 
                      if (cfg.ctlstyl[cid[0]][7][0]>0) {sh.setStroke(cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);} 
                      if (cfg.ctlstyl[cid[0]][1][0]!=0) {sh.setCornerRadius(cfg.ctlstyl[cid[0]][1][0]);} 
                      sh.setColor(pm2[0]); 
if (accver(30002)) // Start version check
  {
                      tc.setBackgroundDrawable(sh);
                      tc.getBackground().setColorFilter(pm2[0],PorterDuff.Mode.DST);
  } // End version check
                    }
               }
              else if (wt.equals("android.widget.radiobutton")) 
               {
                 RadioButton tc = (RadioButton) view;
                 if (stl==5) {tc.setGravity(prm);}
                 if (stl==7 || stl==1)
                    {
                      GradientDrawable sh = new GradientDrawable(); 
                      if (cfg.ctlstyl[cid[0]][7][0]>0) {sh.setStroke(cfg.ctlstyl[cid[0]][7][0], cfg.ctlstyl[cid[0]][7][1]);} 
                      if (cfg.ctlstyl[cid[0]][1][0]!=0) {sh.setCornerRadius(cfg.ctlstyl[cid[0]][1][0]);} 
                      sh.setColor(pm2[0]); 
if (accver(30002)) // Start version check
  {
                      tc.setBackgroundDrawable(sh);
                      tc.getBackground().setColorFilter(pm2[0],PorterDuff.Mode.DST);
  } // End version check
                    }
               }
              else {
              rs[0]=0;fse.release(); return;}                         
              fse.release();
              } catch (Exception ee) {rs[0]=800;}              
            }
         };
        if (cfg.onmainui()) {trc.run();} else {runOnUiThread(trc); try {fse.acquire();} catch (InterruptedException e) { }}
        if (rs[0]==0) {SetSysError(421, err, erl, er1, rel, re1);}
        return;          
      }
      
    public void pluribasicSetViewMargins(final View tc, Integer pr, final Integer cx, final Integer cy)
     {     
       tc.setPadding((int)(cfg.pixel_x[0]*cx), (int)(cfg.pixel_y[0]*cy), (int)(cfg.pixel_x[0]*cx), (int)(cfg.pixel_y[0]*cy));
     }
    //Ends code from extension 'CONTROLSETSTYLE.bin' (Mainapp)

    //Starts code from extension 'CANVASVIEW.bin' (Mainapp)

public class CanvasView extends View 
  {
    public Integer dlg = 0;
    public int width;
    public int height;
    public int swidth;
    public int sheight;
    public float xratio;
    public float yratio;
    public float xratii;
    public float yratii;            
    private Bitmap[] bBitmap = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    public  Canvas[] bCanvas = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    private Path mPath;
    Context context;
    private Paint mPaint;
    private float mX, mY;
    public  boolean paused = false; 
    public  boolean redraw = false; 
    private Integer delay = 30;
    private Integer allowed = 0;
    private Integer trgframerate = 30;
    private Integer curframerate = 0;
    private static final float TOLERANCE = 5;
    public  Integer thickness = 4;
    public  Integer lx = null;
    public  Integer ly = null;
    public  Integer clr = 0;
    Boolean running = true;
    Boolean useunits = false;
    Typeface font = null;
    public float linewidth = 2.0f;
    public float fontbold  = 0.0f;    
    public Integer fontcolor = -16777216;
    public Integer forecolor = -16777216;
    public Integer fontsize  = 20;    
    public Integer backcolor = -1;
    public Integer outlinewidth = 1;    
    public Integer isoutline = 0;
    public Integer outlinecolor = -16777216;
    public Integer curPage  = 0; 
    public Integer Screen   = 0;
    public Integer Page1    = 1;
    public Integer Page2    = 2;
    public Integer Page3    = 3;
    public Integer Page4    = 4;
    public Integer Page5    = 5;
    public Integer Page6    = 6;
    public Integer Page7    = 7;
    public MotionEvent e1   = null;
    Matrix  matrix   = new Matrix();    

    public final Integer[] frame   = {0};
   
    public int client_x    = cfg.client_x[0];
    public int client_y    = cfg.client_y[0] + (Hstatusbar);
    public int calc_x      = cfg.client_x[0];
    public int calc_y      = cfg.client_y[0] + (Hstatusbar * 2);
         
    public int graph_x     = cfg.overlay_x[0];
    public int graph_y     = cfg.overlay_y[0];

    public Rect rcs        = new Rect(0, 0, 0, 0);                         
    public Rect rct        = new Rect(0, 0, 0, 0);                         
    public Rect ups        = new Rect(0, 0, 0, 0);                         
    public Rect upt        = new Rect(0, 0, 0, 0);                         

    public CanvasView(Context c, AttributeSet a, Integer cl) //1
     {
       super(c, a);
       context = c;
       clr     = cl;
       running = true;
       mPath   = new Path();       
       mPaint  = new Paint(Paint.ANTI_ALIAS_FLAG);
       mPaint.setAntiAlias(true);
       ///mPaint.setAntiAlias(true);
       mPaint.setColor(Color.GREEN);
       mPaint.setStyle(Paint.Style.FILL_AND_STROKE);                
       mPaint.setStrokeJoin(Paint.Join.ROUND);
       mPaint.setStrokeCap(Paint.Cap.ROUND); 
       mPaint.setStrokeWidth(this.outlinewidth);
       mPaint.setTextSize(this.fontsize);
       allowed = (int)(1000 / trgframerate);
    }

    @Override
    protected void onSizeChanged(int w, int h, int ow, int oh) 
     {
        super.onSizeChanged(w, h, ow, oh);
        
        swidth  = w; 
        sheight = h;
        client_x = w;
        client_y = h;
                
        if (width==0 && height==0) {width = w; height = h;}        
        xratio = (width / (float) swidth);
        yratio = (height / (float) sheight);
        xratii = (swidth / (float) width);
        yratii = (sheight / (float) height);                
        bBitmap[0] = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        bCanvas[0] = new Canvas(bBitmap[0]);
        
        ups.left   = 0;
        ups.top    = 0;
        ups.right  = width;
        ups.bottom = height;
        upt.left   = 0;
        upt.top    = 0;
        upt.right  = swidth;
        upt.bottom = sheight;
     }
     
    @Override
    protected void onDraw(Canvas canvas) 
      {
        super.onDraw(canvas);
        canvas.drawBitmap(bBitmap[curPage], ups, upt, null);
        //canvas.drawPath(mPath, mPaint);
        redraw = false;
      }
      
    public void createPage(Integer pg, Integer w, Integer h)//0
     {
       if (pg<0) {return;}
       if (pg>30) {return;}
       if (w<1) {w=cfg.client_x[0];}
       if (h<1) {h=cfg.client_y[0];}
       bBitmap[pg] = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
       bCanvas[pg] = new Canvas(bBitmap[pg]);
     }
     
          
    public int xGraph(Integer x)
      {
        float xd = (float) x / this.graph_x;
        xd = (float) xd * this.client_x;
        return (int) xd;
      }
      
    public int yGraph(Integer y)
      {
        float yd = (float) y / this.graph_y;
        yd = (float) yd * this.client_y;
        return (int) yd;
      }      
     
    public void copyPage(Integer p1, Rect src, Integer p2, Rect trg)
     {
       if (p1<0 || p1>30 || p2<0 || p2>30) {return;}
       bCanvas[p2].drawBitmap(bBitmap[p1], src, trg, mPaint);
     }     
      
    public void setPauseState(Boolean st)
     {
       paused = st;
     }      

    public void setDialog(final Integer i, final String ctlid, final Integer cb) 
     {
      dlg   = i;

      new Thread(new Runnable() {public void run() 
       {
        Integer cf = 0;
        String dn = cfg.dlgname[i][0];
        final DCC[] c = {new DCC()};
        c[0].isctrl[0]   = false;
        c[0].hwnd[0]     = i;
        c[0].ctlid[0]    = ctlid;
        c[0].id[0]       = 0;
        c[0].ctype[0]    = 91;
        c[0].lparam[0]   = 0;
        c[0].widget[0]   = "gameview";

        do {
          try {Thread.sleep(100);} catch(InterruptedException e) { }
          if (!cfg.dlgname[i][0].equals(dn)) {return;}
         } while (bBitmap[0]==null);
        do {
          try {Thread.sleep(100);} catch(InterruptedException e) { }
          if (!cfg.dlgname[i][0].equals(dn)) {return;}
         } while (cfg.dlgints[i][26]==null || cfg.dlgints[i][26]!=921);                     

        if (clr==0)
          {
            if (cb!=0) 
             { 
               c[0].callback[0] = cb;
             }
            else
             {
               c[0].callback[0] = cfg.dlgcb[i][0];
             }
          }
        else          
          {
            do {
                try {Thread.sleep(100);} catch(InterruptedException e) { }
               } while (bCanvas[0]==null);
            if (cb!=0) 
             { 
               c[0].callback[0] = cb;
             }
            else
             {
               c[0].callback[0] = cfg.dlgcb[i][0];
             }
          } 
        final Semaphore[] fse = {new Semaphore(0, true)};
        c[0].msg[0]      = 3010; // wm_prepare

        new Thread(new Runnable() {public void run() 
         {
           _Dlgproc(c, c[0].callback[0]);          
           fse[0].release();
           return;
         }}).start();                                
        try {fse[0].acquire();} catch (InterruptedException e) { }

        long ct  = System.currentTimeMillis()+delay;
        long fps = System.currentTimeMillis()+1000;
        int numframes = 0;
        do 
         {
            
          if (paused || cfg.pauseall) {do {try {Thread.sleep(150);} catch(InterruptedException e) { }} while (paused || cfg.pauseall);}  
          cf++;                               
          c[0].wparam[0]  = cf;          
          cfg.nomodal  = true;          
          long fst = System.currentTimeMillis();
          c[0].msg[0]      = 15; // wm_paint
          c[0].count[0]    = frame[0];
          c[0].lparam[0]   = curframerate;
          final boolean[] done = {false};
          
          runOnUiThread(new Runnable(){public void run() 
           {
             _Dlgproc(c, c[0].callback[0]);             
             invalidate();
             done[0] = true;
             return;
           }});
          do {try {Thread.sleep(2);} catch(InterruptedException e) { }} while (!done[0]);          
          
          // Avoid abrupt speed ups.
          
          while (System.currentTimeMillis()<ct) {try {Thread.sleep(2);} catch(InterruptedException e) { }}
          while (1>0)
            {
                long t2 = System.currentTimeMillis()-fst;
                if ((t2*trgframerate) < 1000)
                    {
                        continue;
                    }
                break;                                    
            }
                                 
          numframes++;           
          long ctm = System.currentTimeMillis();           
          if ((ctm-fst) > allowed) {delay-=1;} else if ((ctm-fst) < allowed) {delay+=1;}
          if (ctm>fps) {curframerate = numframes;numframes = 0;fps = ctm+1000;}           
          ct = ctm + delay;
          cfg.nomodal  = false;          
          frame[0] += 1;
                               
         } while (running);                                               
       }}).start();     
     }

    public void redraw() {redraw = true; invalidate();}
    public void moveTo(float x, float y) {mPath.moveTo(x, y);}
    public void lineTo(float x, float y) {mPath.lineTo(x, y);}
    public void isrunning(Boolean r) {this.running = r;}

    @Override
    public boolean onTouchEvent(MotionEvent event) 
      {
        final Integer x = cfg.i(event.getX());
        final Integer y = cfg.i(event.getY());
        final Integer xc = cfg.i(calc_x * (x / (float)client_x));
        final Integer yc = cfg.i(calc_y * (y / (float)client_y));
        final Integer mc = event.getAction();
        
        final DCC[] c = {new DCC()};
        
        switch (mc) {
        case MotionEvent.ACTION_DOWN:            
            c[0].msg[0]    = 573;
            e1 = event;       
            break;
            
        case MotionEvent.ACTION_MOVE:
            if (e1==null) {e1 = event;}        
            plbTouchEvent(event, e1, 512, 0.0f, 0.0f);
            return true;
            
        case MotionEvent.ACTION_UP:
            e1 = null;
            c[0].msg[0]    = 574;                              
            break;            
        }       
        
        final Integer cc = (int) event.getPointerCount();
        final Integer ms = (int) event.getDownTime();
        final Integer i  = (int) event.getActionIndex();
        
        c[0].isctrl[0]   = false;
        c[0].hwnd[0]     = dlg;
        c[0].count[0]    = cc;
        c[0].callback[0] = cfg.dlgcb[dlg][0];
        c[0].ctlid[0]    = "";
        c[0].id[0]       = 0;
        c[0].ctype[0]    = 91;
        c[0].lparam[0]   = ms;
        c[0].wparam[0]   = i;
        c[0].x[0]        = x;
        c[0].y[0]        = y;
        c[0].canvasx[0]  = xc;
        c[0].canvasy[0]  = yc;
        c[0].widget[0]   = "gameview";
                
       new Thread(new Runnable() {public void run() {_Dlgproc(c, c[0].callback[0]); return;}}).start();        
       return true;
     }
  }  

    public CanvasView getCanvasHandleDlgCtl(Integer fid, Object cn)
      {  
        if (cn==null)
          {
            try {return (CanvasView) cfg.dlgcnvs[fid][0];} catch (Exception ee) {return null;}
          }
        else
          {
            final Integer ctlid = cfg.getctlid(fid, controlid(cn));
            if (ctlid<10) {return null;}
            return (CanvasView) cfg.ctlobj[ctlid][0];
          }
      }
    //Ends code from extension 'CANVASVIEW.bin' (Mainapp)

    //Starts code from extension 'RND.bin' (Mainapp)

    // Returns a random number between a certain range. 
    public Integer RND(Integer r1, Integer r2)//1
      {
        Random r = new Random();
        Integer r3 = 0; 
        if (r1==null) {r1 = 0;}
        if (r2==null) {r2 = 999999999;}        
        if (r1 > r2) {r3 = r1; r1 = r2; r2 = r3;}
        r3 = r.nextInt();                
        return (Integer) r.nextInt((r2 - r1) + 1) + r1;         
      }
    //Ends code from extension 'RND.bin' (Mainapp)

    //Starts code from extension 'RGB.bin' (Mainapp)
    // returns a color value composed or Red green and blue. 
    public Integer Rgb(Integer r, Integer g, Integer b)//1
      {
        if (r < 0) {r = 0;}
        if (g < 0) {g = 0;}
        if (b < 0) {b = 0;}
        if (r > 255) {r = 255;}
        if (g > 255) {g = 255;}
        if (b > 255) {b = 255;}        
        r = (r << 16) & 0x00FF0000;
        g = (g << 8) & 0x0000FF00;
        b = b & 0x000000FF;
        return 0xFF000000 | r | g | b;        
      }
    //Ends code from extension 'RGB.bin' (Mainapp)

    //Starts code from extension 'TOUCHLISTENER.bin' (Mainapp)

 public void setTouchListener(View v, final Integer hwnd, final Integer ii, final Boolean isTextbox)//0
   {  
      v.setOnTouchListener(new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event)
          {
            if (cfg==null) {return false;}
            final Integer cc = (int) event.getPointerCount();
            final Integer ms = (int) event.getDownTime();
            final Integer i  = (int) event.getActionIndex();
            final Integer[] msg = {0};
            final int[] err     = {0};
            final int[] erl     = {0};
            final Integer er1   = 0;
            final int[] rel     = {0};
            final Integer re1   = 0;
            Boolean vtr = false;
            
            final View vv = v;
            if (!vv.isEnabled()) {return false;}

            runOnUiThread(new Runnable() {@Override public void run() 
              {
                if (!cfg.keyboardVis) 
                  {
                    cfg.keyboardVis = true;                      
                    new Thread(new Runnable() {public void run() {cfg.sendmessage("*", 610, 2, 2);}}).start();
                  }
              }});
                          
            if (event.getActionMasked()==MotionEvent.ACTION_DOWN) {msg[0]=WM_TOUCH; vtr = true;}               
            if (event.getActionMasked()==MotionEvent.ACTION_POINTER_DOWN) {msg[0]=WM_TOUCH; vtr = true;}
            if (event.getActionMasked()==MotionEvent.ACTION_UP) {msg[0]=WM_RELEASE;}            
            if (event.getActionMasked()==MotionEvent.ACTION_POINTER_UP) {msg[0]=WM_RELEASE;}
            if (event.getActionMasked()==MotionEvent.ACTION_MOVE) {msg[0]=WM_MOUSEMOVE; vtr = true;}
            
            if (msg[0]==WM_TOUCH && cfg.ctlfc[ii][1]!=null)
              {
                cfg.ctlfc[ii][2]      = cfg.ctlfc[ii][0]; 
                cfg.ctlbc[ii][2]      = cfg.ctlbc[ii][0];   
                cfg.ctlstyl[ii][7][3] = cfg.ctlstyl[ii][7][1];                
                ControlSetColor(hwnd, ii, cfg.ctlfc[ii][1], cfg.ctlbc[ii][1], cfg.ctlstyl[ii][7][2], err, erl, er1, rel, re1);                
              }              
            if (msg[0]==WM_RELEASE && cfg.ctlfc[ii][1]!=null)
              {
                ControlSetColor(hwnd, ii, cfg.ctlfc[ii][2], cfg.ctlbc[ii][2], cfg.ctlstyl[ii][7][3], err, erl, er1, rel, re1);
              }
            
            final DCC[] c = {new DCC()};

            for (int i2 = 0; i2<cc; i2++)
              {
                Integer xt        = (int) event.getX(i2);
                Integer yt        = (int) event.getY(i2);
                c[0].x[i2]        = xt;
                c[0].y[i2]        = yt;
                c[0].dialogx[i2]  = cfg.xredux(xt);
                c[0].dialogy[i2]  = cfg.yredux(yt);
              }            
            
            new Thread(new Runnable() {public void run()
             {
             
              String ix1   = (String) vv.getTag();
              String[] ix2 = ix1.split("\\*");
              
              if (ix2.length<2) {return;}
              c[0].formname[0]= ix2[0];
              c[0].ctlid[0]   = ix2[1];
              if (ii<cfg.ctlcb.length) 
                {              
                  c[0].callback[0] = cfg.ctlcb[ii][0];                  
                }
              if (c[0].callback[0]==0) {c[0].callback[0] = cfg.dlgcb[hwnd][0];}                
              c[0].isctrl[0] = true;
              c[0].hwnd[0]    = hwnd;
              c[0].id[0]     = i;
              c[0].count[0]  = cc;
              c[0].ctype[0]  = 1;
              c[0].msg[0]    = msg[0];
              c[0].lparam[0] = ms;
              c[0].wparam[0] = i;
              c[0].widget[0] = "touch";
              _Dlgproc(c, c[0].callback[0]);              
              return;              
             }}).start();
             return vtr;
          }});               
    }
    //Ends code from extension 'TOUCHLISTENER.bin' (Mainapp)

    //Starts code from extension 'FOCUSLISTENER.bin' (Mainapp)


 public void setFocusListener(View v, final Integer ii)//0
   {  
      v.setOnFocusChangeListener(new OnFocusChangeListener() {
        @Override
        public void onFocusChange(View v, boolean hasFocus)
          {
            if (cfg==null) {return;}
            final Integer[] msg = {0};
            Boolean vtr = false;
            final View vv = v;
            if (!vv.isEnabled()) {return;}
            if (hasFocus) {msg[0]=7;} else {msg[0]=8;}
            new Thread(new Runnable() {public void run()
             {
              //while (cfg.getctlflag(ii, 0x00000016)) {try {Thread.sleep(50);} catch (InterruptedException e) { }};
              //cfg.setctlflag(ii, 0x00000016, 1);             
              DCC[] c = {new DCC()};
              String ix1   = (String) vv.getTag();
              String[] ix2 = ix1.split("\\*");
              if (ix2.length<2) {return;}
              c[0].formname[0]= ix2[0];
              c[0].ctlid[0]   = ix2[1];              
              c[0].callback[0] = cfg.ctlcb[ii][0];
              if (cfg.ctlcb[ii][0]==0) {c[0].callback[0] = cfg.dlgcb[cfg.getctlparent(ii)][0];}
              c[0].isctrl[0] = true;
              c[0].hwnd[0]    = cfg.getctlparent(ii);
              c[0].id[0]     = ii;
              c[0].count[0]  = 0;
              c[0].ctype[0]  = 123;
              c[0].msg[0]    = msg[0];
              c[0].widget[0] = "focus";
              //_Dlgproc(c, c[0].callback[0]);
//Integer myturn = cfg.getturn();
//while (myturn!=cfg.nextturn()) {try {Thread.sleep(5);} catch (InterruptedException e) { }};
              _Dlgproc(c, c[0].callback[0]);
//cfg.advturn();
              //cfg.setctlflag(ii, 0x00000016, 0);
              return;
             }}).start();
          }});     
    }
    //Ends code from extension 'FOCUSLISTENER.bin' (Mainapp)

    //Starts code from extension 'DIALOGNEW.bin' (Mainapp)
 

    // Attemps to create a new dialog. 
    public void DialogNew(final Integer Par, final String cpt, final String fnm, final Integer rid, Integer X, Integer Y, Integer W, Integer H, final Integer s, final Integer e, final Integer mp, Integer[] rh, int[] err, int[] erl, Integer er1, int[] rel, Integer re1)//0
      {
        rh[0] = 0;
        if (Par==null) {SetSysError(609, err, erl, er1, rel, re1); return;}
                        
        final String par = cfg.getformname(Par).toLowerCase().trim();        
        final String frm = cpt.toLowerCase().trim();
        
        if (W<0) {W = 0;}
        if (H<0) {H = 0;}        
        final Integer x = X;
        final Integer y = Y;
        final Integer w = W;
        final Integer h = H;
        final Integer[] rr = {0};
        final Semaphore fse = new Semaphore(0, true);        
        final Integer LLF = getResources().getIdentifier(fnm.trim().toLowerCase(), "layout", AppContext.getPackageName());
        
        if (mp==2 && LLF==0 && (rid==null || rid<1)) {SetSysError(479, err, erl, er1, rel, re1); return;}        
        
        runOnUiThread(new Runnable()
         {
          public void run()
           {
             if (!par.equals(""))
              {             
                int pexi = 0;
                for (int i = 0; i<200; i++)
                  {
                    if ((cfg.dlgname[i][0]).equals(par))
                     {   
                        pexi=1; 
                        break;
                     }
                  }
                if (pexi==0) {cfg.setresult(1); fse.release(); return;} 
              }        
//if (x<0 || y<0 || w<0 || h<0) {cfg.setresult(2); fse.release(); return;}
             cfg.setresult(0);
             final Boolean mapused = (cfg.dlgints[92][26]!=null && (cfg.dlgints[92][26]>0));              
             for (int i = 1; i<100; i++)
               {
                 String dn = "";
                 Integer od = 0;
                                 
                      if ((mp==1) && mapused) {dn = cfg.dlgname[i][0]; od = 1;}                  
                 else if ((mp==1) && (i!=92)) {continue;}
                 else if ((mp!=1) && (i==92)) {continue;}
                 else {dn = cfg.dlgname[i][0];}
                 



                 
                 if (dn.equals(""))
                   { 
                     String dnm        = "dialogo" + String.valueOf(i);
                     cfg.dlgname[i][0] = dnm;
                     cfg.dlgccc++;
                     rr[0]             = i;
                     cfg.dlgcrts[i][0] = cfg.dlgccc;
                     cfg.dlgflgs[i][0] = 0;                     
                     
                     if (cfg.dlghndl[i][0]==null)
                      {                      
                        if (od==1)
                         {
                           cfg.dlghndl[i][0] = new RelativeLayout(AppContext);
                         }    
                        else if (mp==1)
                         {
                          if (cfg.dlghndl[i][0]==null) {cfg.dlghndl[i][0] = bMapLayout(AppContext);}
                         }
                        else if (mp==2)
                         {
                          Integer rrid = rid;
                          if (rid==null) {rrid=LLF;}
                          try 
                            {
                              cfg.dlghndl[i][0] = (RelativeLayout) getLayoutInflater().inflate(rrid, null);
                            }
                          catch (Exception e1) {try 
                            {                             
                              cfg.dlghndl[i][0] = (LinearLayout) getLayoutInflater().inflate(rrid, null);                            
                            } catch (Exception e2) {cfg.setresult(3); fse.release(); return;}}
                         }
                        else
                         { 
                          cfg.dlghndl[i][0] = new RelativeLayout(AppContext);
                         }
                      }
                     else if (od==1)
                      {
                       cfg.dlghndl[i][0] = new RelativeLayout(AppContext);
                      }                     
                     else
                      {
                       if (i==92) {bMapShowc(cfg.dlghndl[i][0]);}
                      }
                                           
                     cfg.dlghpar[i][0] = Par;
                     cfg.dlgpar[i][0]  = par;                     
                     cfg.dlgtext[i][0] = cpt;
                     cfg.dlgcapt[i][0] = frm;
                     cfg.dlgints[i][0] = x;
                     cfg.dlgints[i][1] = y;
                     cfg.dlgints[i][2] = w;
                     cfg.dlgints[i][3] = h;
                     cfg.dlgints[i][4] = s;
                     cfg.dlgints[i][5] = e;
                     cfg.dlgints[i][14] = 0;
                     cfg.dlgints[i][19] = 0;
                     cfg.dlgints[i][20] = 0;
                     cfg.dlgints[i][34] = RND(1, 99999999);
                     cfg.dlgstyl[i][34][0] = 0;
                     cfg.dlgints[i][35] = 0;
                     cfg.dlgfont[i][0] = "";
                     cfg.dlgfsiz[i][0] = 0;
                     cfg.dlgfcol[i][0] = Color.parseColor("#000000");
                     cfg.dlgbcol[i][0] = Color.parseColor("#F0F0F0");
                     
                     if (mp==2 && rid!=null)
                       {
                         LinearLayout ll = (LinearLayout) cfg.dlghndl[i][0];                     
                         
                         if (i!=92)
                          {
                           try {((ViewGroup)ll.getParent()).removeView(ll);} catch (Exception e) {}
                          }                         
                         if ((s & 268435456)==268435456) {ll.setVisibility(View.INVISIBLE); cfg.dlgstyl[i][34][0] = 1;}

                         try 
                          {
                           cfg.dlgbcol[i][0] = ((ColorDrawable)ll.getBackground()).getColor();
                          }
                         catch (Exception ee) 
                          {
                           cfg.dlgbcol[i][0] = Color.parseColor("#000000");                         
                          }
                          RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                          params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
                          
                          if ((s & 2048) == 2048)
                            { 
                              GradientDrawable sh = new GradientDrawable();                                            
                              sh.setStroke(cfg.yscaled(4), cfg.dlgfcol[i][0]); 
                              sh.setCornerRadius(cfg.yscaled(8)); 
                              sh.setColor(cfg.dlgbcol[i][0]); 
                              try {ll.setBackgroundDrawable(sh);} catch (Exception ee) {} 
                              ll.getBackground().setColorFilter(cfg.dlgbcol[i][0], PorterDuff.Mode.MULTIPLY);
                            }
                          else
                            {                                                  
                              ll.setBackgroundColor(cfg.dlgbcol[i][0]);
                            }
                          ll.setTag(FCAC.strs[2]);
                          ll.setId(i+5000);                         
                          if (cfg.client_x[0]>0) {cfg.setformsized(i);}
                          break;
                       }
                     else
                       {                          
                         RelativeLayout rl = (RelativeLayout) cfg.dlghndl[i][0];                     
                         
                         if (i!=92)
                          {
                           try {((ViewGroup)rl.getParent()).removeView(rl);} catch (Exception e) {}
                          }
                         
                         if ((s & 268435456)==268435456) {rl.setVisibility(View.INVISIBLE); cfg.dlgstyl[i][34][0] = 1;}                    
                         
                         if (mp==1 || mp==3)
                          {
                           
                           boolean addit = true;
                            
                           if (mp==1 && ((s & 256)!=256)) {addit=false;}
                           
                           if (addit) 
                              {
                                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                                params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);                    
                                cfg.dlgcnvs[i][0] = new CanvasView(AppContext, null, 0); 
                                CanvasView tv = (CanvasView) cfg.dlgcnvs[i][0];
                                tv.setId(10000);                       
                                rl.addView(tv, params);
                                tv.setTag(frm.toLowerCase() + "*DialogCanvas*0");
                                cfg.dlgbcol[i][0] = Color.parseColor("#FFFFFF");
                                if ((s & 1024)==1024) {tv.setPauseState(true);}
                                rl.setBackgroundColor(cfg.dlgbcol[i][0]);
                                if (mp==1) {tv.setVisibility(View.INVISIBLE);}                            
                                if (mp==1 && ((s & 64)==64))
                                  {                              
                                    setFocusListener(tv, 10000);
                                    setTouchListener(tv, i, 10000, false);
                                  }
                                else
                                  {
                                    tv.setOnClickListener(map.this); 
                                    tv.setOnTouchListener(PLBgestureListener);                                
                                  }
                                tv.setDialog(i, "", 0);                              
                              }
                          }                       
                         else if (mp==2)
                          {
                           try 
                            {
                             cfg.dlgbcol[i][0] = ((ColorDrawable)rl.getBackground()).getColor();
                            }
                           catch (Exception ee) 
                            {
                             cfg.dlgbcol[i][0] = Color.parseColor("#000000");                         
                            }
                            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                            params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
                          }   
                         else if (mp==4)
                          {
                                                                                                
                          }
                         
                         if ((s & 2048) == 2048)
                           {
                             GradientDrawable sh = new GradientDrawable();                           
                             if ((e & 32768) != 32768)
                               {                                                                              
                                 sh.setStroke(cfg.yscaled(4), cfg.dlgfcol[i][0]); 
                                 sh.setCornerRadius(cfg.yscaled(8)); 
                                 sh.setColor(cfg.dlgbcol[i][0]); 
                                 try {rl.setBackgroundDrawable(sh);} catch (Exception ee) {}
                               }
                             else
                               {
                                 sh.setStroke(cfg.yscaled(cfg.thickness), cfg.bordercolor); 
                                 sh.setCornerRadius(cfg.yscaled(cfg.roundness)); 
                                 sh.setColor(cfg.backgroundc); 
                                 try {rl.setBackgroundDrawable(sh);} catch (Exception ee) {}
                               }
                             rl.getBackground().setColorFilter(cfg.backgroundc, PorterDuff.Mode.DST);                               
                           }
                         else
                           {                                                  
                             rl.setBackgroundColor(cfg.dlgbcol[i][0]);
                           }
                                                      
                         rl.setTag(FCAC.strs[2]);
                         rl.setId(i+5000);                         
                         if (cfg.client_x[0]>0) {cfg.setformsized(i);}
                         break;
                      }
                   }
               }         
             fse.release();
           }
        });
        try {fse.acquire();} catch (Exception ee) { }
        if (cfg.getresult()>0) {SetSysError(249+cfg.getresult(), err, erl, er1, rel, re1); return;}
        if (mp==2)
          {
            boolean zr = false;
            final Integer rz = rr[0];        
            do {zr = cfg.sizesready(); if (zr) {break;}
            try {Thread.sleep(100);} catch(Exception ee) { }} while (!zr);           
            runOnUiThread(new Runnable()
              {
                public void run()
                 {                
                   cfg.namecontrols(rid, frm, rz);
                   cfg.updatecontrols(rid, frm, rz);
                   if ((s & 268435456)!=268435456) 
                     {
                       cfg.setformactive(rz);                   
                       cfg.ondisplay(rz);
                     }                           
                   fse.release();
                   return;
                 }        
              });
            try {fse.acquire();} catch (Exception ee) { }
          }        
        if (rh[0]!=null) {rh[0] = rr[0];}
      }
    //Ends code from extension 'DIALOGNEW.bin' (Mainapp)

    //Starts code from extension 'GPSFUNCTIONS.bin' (Mainapp)

    @Override
    public void onLocationChanged(Location loc) //0
      {
        if (loc==null) {return;}
        if (cfg==null) {return;}
       
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) 
            {
                if (loc.isFromMockProvider())
                    {
                        Gpsfk[0] = -1;
                    }
                else
                    {
                        Gpsfk[0] = 0;
                    }       
            }
        else 
            {
                String mockLocation = "0";
                try {
                    mockLocation = Settings.Secure.getString(AppContext.getContentResolver(), Settings.Secure.ALLOW_MOCK_LOCATION);
                    if (!mockLocation.equals("0"))
                        {
                            Gpsfk[0] = -1;
                        }
                    else
                        {
                            Gpsfk[0]= 0;
                        }                    
                } catch (Exception e) {}
            }
        
        cfg.gpslat  = loc.getLatitude();
        cfg.gpslon  = loc.getLongitude();
        Gpslat[0]   = loc.getLatitude();
        Gpslng[0]   = loc.getLongitude();
        Gpson[0]    = -1;
        Gpsgt[0]    = -1;
        
        cfg.gpslat  = loc.getLatitude();
        cfg.gpslon  = loc.getLongitude();        
        
        if (_MVlock) {MapViewLockCamera(cfg.gpslat, cfg.gpslon);}

        new Thread(new Runnable() {public void run() {cfg.sendmessage("*", 3003, 0, 0);}}).start();
        cfg.gpsgot = -1;

        //try 
        //  {
        //    SharedPreferences settings = getSharedPreferences("PluriBASICSystem", 0);
        //    if (settings==null) {return;}        
        //    SharedPreferences.Editor editor = settings.edit();
        //    if (editor==null) {return;}
        //    editor.putFloat("LastKnownLatitude", (float)(double) cfg.gpslat);
        //    editor.putFloat("LastKnownLongitude",(float)(double) cfg.gpslon);
        //    editor.commit();
        //  }
        //catch (Exception e) {}
      }    
      
    @Override
    public void onProviderDisabled(String provider) 
      {
        Gpson[0]    = 0;
        if (cfg!=null) {cfg.sendmessage("*", 3004, 0, 0);}
      }
    @Override
    public void onProviderEnabled(String provider) 
      {
        Gpson[0]    = -1;
        if (cfg!=null) {cfg.sendmessage("*", 3004, -1, 0);}
      }
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) 
     {
      if (cfg!=null) {cfg.sendmessage("*", 3005, status, 0);}
     }
    //Ends code from extension 'GPSFUNCTIONS.bin' (Mainapp)

    //Starts code from extension 'GPSCOORDS.bin' (Mainapp)

    // Returns the GPS location.  
    public Integer gpscoords(Double[] lat, Double[] lon)//1
      {     
      
        if (PLBlm1==null)
         {
            try {             
                    PLBlm1 = (LocationManager) getSystemService(this.LOCATION_SERVICE);
                } catch (Exception ee) {PLBlm1 = null;}
             Twhere[0] = this;   
             return 0;    
        }
       else if ((!gpsRequ1) || (!gpsRequ2))
        {   
            runOnUiThread(new Runnable()
                {
                    public void run()
                    {                               
                       try { 
                           if (!gpsRequ1)
                              {           
                                 if (PLBlm1.isProviderEnabled(LocationManager.GPS_PROVIDER))
                                   {
                                     PLBlm1.requestLocationUpdates(LocationManager.GPS_PROVIDER, 500, 1, Twhere[0]);
                                     gpsRequ1 = true;                
                                   }
                                 if (PLBlm1.isProviderEnabled(LocationManager.NETWORK_PROVIDER))
                                   {
                                     PLBlm1.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 500, 1, Twhere[0]);
                                     gpsRequ2 = true;
                                   }
                              }
                         } catch (Exception ee) {PLBlm1 = null;}              
                    }
                });
            if ((!gpsRequ1) && (!gpsRequ2))
                {                                                          
                    return 0;
                }         
         }
        

        if (cfg.gpsgot==-1 && cfg.gpslat!=null && cfg.gpslon!=null)
          {
            lat[0] = cfg.gpslat;
            lon[0] = cfg.gpslon;
            return -1; 
          }          
                  
       // try 
       //   {  
       //     SharedPreferences settings = getSharedPreferences("PluriBASICSystem", 0);
       //     lat[0] = (double) settings.getFloat("LastKnownLatitude", 0.0f);
       //     lon[0] = (double) settings.getFloat("LastKnownLongitude", 0.0f);
       //   }
       // catch (Exception e) {}  

        if ((lat[0]==null && lon[0]==null) || (lat[0]==0.0 && lon[0]==0.0)) {lat[0]=0.0; lon[0]=0.0; return 0;}
        
        return -1;
      }
    //Ends code from extension 'GPSCOORDS.bin' (Mainapp)

    //Starts code from extension 'MAPVIEWSETALL.bin' (Mainapp)


    // Sets the latitude longitude and Zoom in a Map Dialog.  
    public void MapViewSetAll(final Double nz, final Double lat, final Double lon, final Double ang, final Double tilt, int[] err, int[] erl, Integer er1, int[] rel, Integer re1)//0
      {
        cfg.maplat  = lat;
        cfg.maplon  = lon;
        cfg.mapzoom = nz;        
        if (cfg.dlghndl[92][0]==null) {SetSysError(232, err, erl, er1, rel, re1); return;}
        RelativeLayout rl = (RelativeLayout) cfg.dlghndl[92][0];
        View vm = (View) rl.findViewById(R.id.pluribasic_map);
        if (vm==null) {SetSysError(233, err, erl, er1, rel, re1); return;}
        if (cfg.map==null) {SetSysError(234, err, erl, er1, rel, re1); return;}
        if (!cfg.mapready) {SetSysError(235, err, erl, er1, rel, re1); return;}
        final GoogleMap map = (GoogleMap) cfg.map; 
        if (map==null) {SetSysError(235, err, erl, er1, rel, re1); return;}
        final Semaphore fse = new Semaphore(0, true);       
        runOnUiThread(new Runnable()
         {
          public void run()
           {           
            CameraPosition ccp = map.getCameraPosition();           
            Builder bld = new CameraPosition.Builder();
            if (nz!=null) {bld.zoom((float)(double) nz);} else {bld.zoom(ccp.zoom);}                                                
            if (lat!=null && lon!=null) {bld.target(new LatLng(lat, lon));} else {bld.target(ccp.target);}
            if (ang!=null) {bld.bearing((float)(double) ang);} else {bld.bearing(ccp.bearing);}
            if (tilt!=null) {bld.tilt((float)(double) tilt);} else {bld.tilt(ccp.tilt);}
            CameraPosition cp = bld.build();            
            if (cfg.mapdurat>0)
             {             
               map.animateCamera(CameraUpdateFactory.newCameraPosition(cp), cfg.mapdurat, null);               
             }
            else
             {
               map.moveCamera(CameraUpdateFactory.newCameraPosition(cp));
             }
            fse.release();
           }           
         });
        try {fse.acquire();} catch (InterruptedException e) { }               
      }
    //Ends code from extension 'MAPVIEWSETALL.bin' (Mainapp)

    //Starts code from extension 'MAPVIEWSETLOCK.bin' (Mainapp)


    // Locks the camera viewpoint in the local position. 
    public void MapViewSetLock(Integer state, Integer mode)//0
      {
        if (state==0) {_MVlock = false;} else {_MVlock = true;}
      }
      
//NOT INTENDED FOR MANUAL USE. This function is handled by the system. 
    public void MapViewLockCamera(Double lat, Double lon)
      {
        if (cfg.map==null || !cfg.mapready) {return;}
        final GoogleMap map = (GoogleMap) cfg.map; 
        if (map==null) {return;}
        CameraPosition ccp = map.getCameraPosition();
        Builder bld = new CameraPosition.Builder();
        
        // Use default settings except latitude and longitude.
        bld.zoom(ccp.zoom);                                                
        bld.target(new LatLng(lat, lon));        
        bld.bearing(ccp.bearing);        
        bld.tilt(ccp.tilt);        
        CameraPosition cp = bld.build();
                    
        map.animateCamera(CameraUpdateFactory.newCameraPosition(cp), 600, null);
        
      }
    //Ends code from extension 'MAPVIEWSETLOCK.bin' (Mainapp)

    //Starts code from extension 'SCREENTRANSFORM.bin' (Mainapp)
 
    // Conversts pixels, units, canvas, and GPS coordinates.  
    public void ScreenTransform(Integer fid, Object id, Object arr, Object xin, Object yin, Object xout, Object yout, Integer m, final Integer t)//0
      {
      
//final Integer[] xf = {cfg.dlgints[92][0]};
//final Integer[] yf = {cfg.dlgints[92][1]};        
//if ((cfg.dlgints[92][4] & 4) != 4) {xf[0] = 0; yf[0] = 0;}
        
        final Integer[] xf = {0};
        final Integer[] yf = {0};
        
//if ((cfg.dlgints[92][4] & 4) != 4) {xf[0] = 0; yf[0] = 0;}              
      
        if (m==0) // Pixels to...
          {
            final Integer x      = ((Integer) xin) - xf[0];
            final Integer y      = ((Integer) yin) - yf[0];


            if (t==1) // Pixels to units.
             {
               final Integer[] xo = (Integer[]) xout;
               final Integer[] yo = (Integer[]) yout;             
               xo[0] = cfg.xredux(x);            
               yo[0] = cfg.yredux(y);
             } 
            else if (t==3) // Pixels to Canvas
             {
               final Integer[] xo = (Integer[]) xout;
               final Integer[] yo = (Integer[]) yout;             
               xo[0] = 0;            
               yo[0] = 0;
               final CanvasView cv = getCanvasHandleDlgCtl(cfg.display, null);
               if (cv==null) {return;}               
               if (!(cfg.display>0)) {return;}
               xo[0] = (int) (x * cv.xratio);            
               yo[0] = (int) (y * cv.yratio);
             }              
            else if (t==2) // Pixels to GPS
             {      
               final Double[] xo    = (Double[]) xout;
               final Double[] yo    = (Double[]) yout;                   
               final Semaphore fse = new Semaphore(0, true);
               final Runnable trc = new Runnable() 
                {
                  @Override
                  public void run()      
                   {
                     xo[0] = 0.0;            
                     yo[0] = 0.0;                   
                     if (cfg.dlghndl[92][0]==null) {return;}
                     if (cfg.map==null) {return;}
                     if (!cfg.mapready) {return;}                   
                     GoogleMap map = (GoogleMap) cfg.map;                      
                     if (map==null) {return;}
                     Projection prj = map.getProjection();
                     LatLng ll = prj.fromScreenLocation(new Point(x, y));    
                     xo[0] = _Cd(ll.latitude);            
                     yo[0] = _Cd(ll.longitude);
                     fse.release();
                   }
                };
               if (cfg.onmainui()) {trc.run();} else {runOnUiThread(trc); try {fse.acquire();} catch (InterruptedException e) { }}
             }             
             
          }
        if (m==1) // Units to...
          {

            final Integer x      = ((Integer) xin) - xf[0];
            final Integer y      = ((Integer) yin) - yf[0];            

            if (t==0) // Units to Pixels
             {
               final Integer[] xo = (Integer[]) xout;
               final Integer[] yo = (Integer[]) yout;             
               xo[0] = cfg.xscaled(x);            
               yo[0] = cfg.yscaled(y);             
             }  
            else if (t==3) // Units to Canvas
             {
               final Integer[] xo = (Integer[]) xout;
               final Integer[] yo = (Integer[]) yout;             
               xo[0] = 0;            
               yo[0] = 0;
               final CanvasView cv = getCanvasHandleDlgCtl(cfg.display, null);
               if (cv==null) {return;}               
               if (!(cfg.display>0)) {return;}
               xo[0] = (int) (cfg.xscaled(x) * cv.xratio);            
               yo[0] = (int) (cfg.yscaled(y) * cv.yratio);               
             }  
            else if (t==2) // Units to GPS
             {
               final Double[] xo    = (Double[]) xout;
               final Double[] yo    = (Double[]) yout;                         
               final Semaphore fse = new Semaphore(0, true);
               final Runnable trc = new Runnable() 
                {
                  @Override
                  public void run()      
                   {
                     xo[0] = 0.0;            
                     yo[0] = 0.0;                   
                     if (cfg.dlghndl[92][0]==null) {return;}
                     if (cfg.map==null) {return;}
                     if (!cfg.mapready) {return;}                   
                     GoogleMap map = (GoogleMap) cfg.map;                   
                     Projection prj = map.getProjection();
                     LatLng ll = prj.fromScreenLocation(new Point(cfg.xscaled(x), cfg.yscaled(y)));    
                     xo[0] = _Cd(ll.latitude);            
                     yo[0] = _Cd(ll.longitude);
                     fse.release();
                   }
                };
               if (cfg.onmainui()) {trc.run();} else {runOnUiThread(trc); try {fse.acquire();} catch (InterruptedException e) { }}
             }             
             
          }
        else if (m==2)  // gps coordinates to...
          {
            final Double x      = (Double) xin;
            final Double y      = (Double) yin;
            
            final Integer[] xo    = (Integer[]) xout;
            final Integer[] yo    = (Integer[]) yout;
            
            final Semaphore fse = new Semaphore(0, true);
            final Runnable trc = new Runnable() 
             {
               @Override
               public void run()      
                {
                  xo[0] = 0;            
                  yo[0] = 0;                   
                  if (cfg.dlghndl[92][0]==null) {return;}
                  if (cfg.map==null) {return;}
                  if (!cfg.mapready) {return;}                   
                  GoogleMap map = (GoogleMap) cfg.map;                
                  Projection prj = map.getProjection();
                  Point pp = prj.toScreenLocation(new LatLng(x, y));
                  if (t==0) // Pixels
                    {     
                      xo[0] = _CI(pp.x);            
                      yo[0] = _CI(pp.y);
                    }
                  else if (t==1) // Units
                    {
                      xo[0] = cfg.xredux(_CI(pp.x));            
                      yo[0] = cfg.yredux(_CI(pp.y));                   
                    }
                  else if (t==1) // Canvas
                    {
                      final CanvasView cv = getCanvasHandleDlgCtl(cfg.display, null);
                      if (cv==null) {return;}               
                      if (!(cfg.display>0)) {return;}
                      xo[0] = (int) (pp.x * cv.xratio);            
                      yo[0] = (int) (pp.y * cv.yratio);                   
                    }                     
                  fse.release();
                }
             };
            if (cfg.onmainui()) {trc.run();} else {runOnUiThread(trc); try {fse.acquire();} catch (InterruptedException e) { }}
          }
        if (m==3) // Canvas to...
          {

            final Integer x      = ((Integer) xin) - xf[0];
            final Integer y      = ((Integer) yin) - yf[0];            

            final CanvasView cv = getCanvasHandleDlgCtl(cfg.display, null);
            if (cv==null) {return;}

            if (t==0) // Canvas to Pixels...
             {
               final Integer[] xo = (Integer[]) xout;
               final Integer[] yo = (Integer[]) yout;             
               xo[0] = (int) (x * cv.xratii);            
               yo[0] = (int) (y * cv.yratii);
             } 
            else if (t==1) // Canvas to units
             {
               final Integer[] xo = (Integer[]) xout;
               final Integer[] yo = (Integer[]) yout;             
               xo[0] = cfg.xscaled((int) (x * cv.xratii));            
               yo[0] = cfg.yscaled((int) (y * cv.yratii));
             }               
            else if (t==2) // Canvas to GPS (should not be necessary, added just in case).
             {      
               final Double[] xo    = (Double[]) xout;
               final Double[] yo    = (Double[]) yout;                   
               final Semaphore fse = new Semaphore(0, true);
               final Runnable trc = new Runnable() 
                {
                  @Override
                  public void run()      
                   {
                     xo[0] = 0.0;            
                     yo[0] = 0.0;                   
                     if (cfg.dlghndl[92][0]==null) {return;}
                     if (cfg.map==null) {return;}
                     if (!cfg.mapready) {return;}                   
                     GoogleMap map = (GoogleMap) cfg.map;                      
                     if (map==null) {return;}
                     Projection prj = map.getProjection();
                     LatLng ll = prj.fromScreenLocation(new Point(((int) (x * cv.xratii)), ((int) (y * cv.yratii))));    
                     xo[0] = _Cd(ll.latitude);            
                     yo[0] = _Cd(ll.longitude);
                     fse.release();
                   }
                };
               if (cfg.onmainui()) {trc.run();} else {runOnUiThread(trc); try {fse.acquire();} catch (InterruptedException e) { }}
             }             
             
          }
                    
      }
    //Ends code from extension 'SCREENTRANSFORM.bin' (Mainapp)

    //Starts code from extension 'GOOGLE_MAPS.bin' (Mainapp)

//#IMPORTS : java.lang.Object
//#IMPORTS : android.os.Parcelable

//#IMPORTS : com.google.android.gms.maps.MapsInitializer
//#IMPORTS : com.google.android.gms.maps.MapsInitializer.Renderer
//#IMPORTS : com.google.android.gms.maps.OnMapsSdkInitializedCallback

    // This section contains everything required for displaying a google map.  
    public void Google_Maps(final RelativeLayout rl, String txc, final RelativeLayout.LayoutParams copts, final Integer s, Integer cb)//0
      {

      }
    
    public void pluribasicRequestGoogleMapPermissions()
      {     
            if (ActivityCompat.checkSelfPermission(AppContext, android.Manifest.permission.WRITE_EXTERNAL_STORAGE)!=PackageManager.PERMISSION_GRANTED)
             {
               String[] APP_PERMITS={android.Manifest.permission.WRITE_EXTERNAL_STORAGE};
               requestPermissions(APP_PERMITS, 2001);
             }
            else
             {
             }
     }      
      
    class MkInfo
     {
       public String tag = "";
       public Integer user = 0;
     }  
      
    public void bMapShowc(Object hn)
      {
        RelativeLayout rl = (RelativeLayout) hn;
        rl.setVisibility(View.VISIBLE);
        View vm = (View) rl.findViewById(R.id.pluribasic_map);
        if (vm!=null) 
          {
            vm.setVisibility(View.VISIBLE); 
          }   
      }
            
    public RelativeLayout bMapLayout(Context ac)
      {               
        RelativeLayout rlgm = (RelativeLayout) getLayoutInflater().inflate(R.layout.map_activity, null);
        mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.pluribasic_map); 
        mapFragment.getMapAsync(map.this);
        return rlgm;    
      }
      
    public void mapClickFunction(LatLng ll)
      {
         final Integer xp[] = {0};
         final Integer yp[] = {0};
         final Integer xd[] = {0};
         final Integer yd[] = {0};              
        
         ScreenTransform(null, null, null, ll.latitude, ll.longitude, xp, yp, 2, 0);
         ScreenTransform(null, null, null, ll.latitude, ll.longitude, xd, yd, 2, 1);
         
         final Double lat = ll.latitude;
         final Double lon = ll.longitude;
      
         new Thread(new Runnable() {public void run()                
           {
             DCC[] c = {new DCC()};
             c[0].hwnd[0]      = 92;
             c[0].id[0]        = 0;           
             c[0].ctype[0]     = 2231;
             c[0].msg[0]       = 245;
             c[0].wparam[0]    = 92;
             c[0].lparam[0]    = 0;
             c[0].latitude[0]  = lat;
             c[0].longitude[0] = lon;
             c[0].x[0]         = xp[0];
             c[0].y[0]         = yp[0];
             c[0].dialogx[0]   = xd[0];
             c[0].dialogy[0]   = yd[0];                                  
             c[0].widget[0]    = "gMaps";
             c[0].hwnd[0]      = 92;
             c[0].callback[0]  = cfg.dlgcb[92][0];
             if (c[0].callback[0]!=null) 
               {
                 _Dlgproc(c, c[0].callback[0]);
              }
          }}).start();
      }  

    @Override
    public void onMapReady(GoogleMap map)
      {      
      
        cfg.map = map;
        cfg.mapready = true;
        if (Emm == null) {Emm = new HashMap<Marker, MkInfo>();}                
        

        map.setMapType(cfg.mapmode);        
        map.setMyLocationEnabled(cfg.myloc);
        
        if (cfg.mx1!=null && cfg.mx2!=null && cfg.my1!=null && cfg.my2!=null)
         {
           map.setPadding(cfg.xscaled(cfg.mx1), cfg.yscaled(cfg.my1), cfg.xscaled(cfg.mx2), cfg.yscaled(cfg.my2));
         }
        
        //map.getUiSettings().setCompassEnabled(true);
        
        if (cfg.maprotable==0)
         {                       
           map.getUiSettings().setRotateGesturesEnabled(false);
         }
        else
         {
           map.getUiSettings().setRotateGesturesEnabled(true); 
         }
        
//        map.setOnMapClickListener(new OnMapClickListener() 
//         {
//           @Override
//           public void onMapClick(LatLng ll) 
//             {
//                mapClickFunction(ll);
//             }
//         })


         
        map.setOnMarkerClickListener(new OnMarkerClickListener()
         {
           @Override
           public boolean onMarkerClick(Marker m) 
            {
              if (m == null) {return false;}  
              try {
                      final MkInfo mki = Emm.get(m);
                      final LatLng ll = m.getPosition();
                      cfg.mlat = ll.latitude;
                      cfg.mlon = ll.longitude;
                      cfg.mwid = "marker";               
                      cfg.mttl = m.getTitle();              
                      cfg.mtxt = mki.tag;
                      cfg.mobj = m;
                      
                      new Thread(new Runnable() {public void run()
                       {
                         cfg.sendmessage("@", 577, mki.user, 0);
                       }}).start();
                   } catch (Exception ee) {}
              return true;
            }
         });
         
        map.setOnMapClickListener(new OnMapClickListener()
         {    
           @Override
           public void onMapClick (LatLng ll)
            {
              mapClickFunction(ll);
              return;
            }
         });
        
//        map.setOnCameraMoveListener(new OnCameraMoveListener()
//         {
//            @Override
//            public void onCameraMoveStarted(int reason) {cfg.sendmessage("@", 3045, 2, reason);}
//            @Override
//            public void onCameraMove() {cfg.sendmessage("@", 3045, 1, 0);}
//         })
 
        float newzoom = (float)(double) cfg.mapzoom;        
        LatLng ll = new LatLng(cfg.maplat, cfg.maplon);
        map.setMapType(cfg.mapmode);       
        
        if (cfg.mapzoom==0)
          {
            if (cfg.maplat!=0 && cfg.maplon!=0)
              {
                map.moveCamera(CameraUpdateFactory.newLatLng(ll));
              }
          }        
        else
          {
          
            if (cfg.maplat!=0 && cfg.maplon!=0)
              {
                map.moveCamera(CameraUpdateFactory.newLatLngZoom(ll, newzoom));
              }
            else
              {                      
                map.moveCamera(CameraUpdateFactory.zoomTo(newzoom));
              }
          }
          
        
        new Thread(new Runnable() {public void run()                
         {
           cfg.sendmessage("@", 3006, 0, 0);
         }}).start();         
      }
    //Ends code from extension 'GOOGLE_MAPS.bin' (Mainapp)

    //Starts code from extension 'DIALOGGETSIZE.bin' (Mainapp)
    // returns the size of the dialog. 
    public void DialogGetSize(Integer fid, Integer[] w, Integer[] h)//0
      {
        w[0] = 0; h[0] = 0;
        if (fid<1) {w[0] = cfg.overlay_x[0]; h[0] = cfg.overlay_y[0]; return;}
        w[0] = cfg.dlgints[fid][2];
        h[0] = cfg.dlgints[fid][3];
      }
    //Ends code from extension 'DIALOGGETSIZE.bin' (Mainapp)

    //Starts code from extension 'CONTROLSETFOCUS.bin' (Mainapp)


    // Sets the focused view. 
    public void ControlSetFocus(Integer fid, Object id)//0
      {
        if (fid<0) {fid=-fid;}
        Integer cid = cfg.getctlid(fid, controlid(id));
        if (cid<1) {return;}
        Integer did = cfg.display;
        if (did==-1) {return;}                
        ControlSetFocusPuppet(did, cid);
        
      }

    // Some internal functions call this function.    
    public void ControlSetFocusPuppet(final Integer did, final Integer cid)//0
      {
        //Log.d("==================", "=======33");      
        //if (cfg.getctlparent(cid) != did) {return;}
        //Log.d("==================", "=======44");
        
        final Semaphore fse = new Semaphore(0, true);        
        final Runnable trc = new Runnable() 
         {
          @Override
          public void run()      
           {        
             View view = (View) cfg.ctlobj[cid][0];
             if (view==null) {fse.release(); return;}            
             String wt = view.getClass().getName().toLowerCase();
             
             if (cfg.ctlstyl[cid][8][0]==null)
               {
                 if (wt.equals("android.widget.edittext") || (getCustomClassName(wt)).equals("customedittext"))                  
                  {                    
                    cfg.ctlstyl[cid][8][0] = InputType.TYPE_CLASS_TEXT;                  
                  }
               }                
               
             view.requestFocus();
               
             //if (cfg.ctlstyl[cid][8][0]!=0)
             //  {
                   
                 if (wt.equals("android.widget.edittext") || (getCustomClassName(wt)).equals("customedittext")) 
                   {
                     final EditText tc = (EditText) view;
                     if (tc.getVisibility() == View.VISIBLE)
                       {
                         try 
                          {
                           cfg.keyboardVis = true;
                           //tc.setVisibility(View.VISIBLE);
                           //tc.setInputType(cfg.ctlstyl[cid][8][0]);
                           InputMethodManager imm = (InputMethodManager) getSystemService("input_method");
                           imm.showSoftInput(tc, InputMethodManager.SHOW_IMPLICIT);
                           
                          } catch (Exception ee) {}
                         if (0<1) {fse.release(); return;}
                       } 
                   }
             //  }  
               
             try 
               {
                 cfg.keyboardVis = false;
                 InputMethodManager im = (InputMethodManager) getApplicationContext().getSystemService("input_method");
                 im.hideSoftInputFromWindow((null==getCurrentFocus()) ? null : getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_IMPLICIT_ONLY);
                 im.hideSoftInputFromWindow((null==getCurrentFocus()) ? null : getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                 
               } 
             catch (Exception e) { }
             
            fse.release();                  
           }
         };
        if (onmainui()) {trc.run();} else {runOnUiThread(trc); try {fse.acquire();} catch (InterruptedException e) { }}                      
      }
    //Ends code from extension 'CONTROLSETFOCUS.bin' (Mainapp)

    //Starts code from extension 'DIALOGSHOW.bin' (Mainapp)


    // Displays a newly created dialog. 
    public void DialogShow(final Integer Dnm, Integer Cb, final Integer md, int[] err, int[] erl, Integer er1, int[] rel, Integer re1)//0
      {
        if (Dnm==null || Dnm<0) {SetSysError(610, err, erl, er1, rel, re1); return;}
        if (cfg==null) {return;}                         
        final String dnm = cfg.getformname(Dnm).toLowerCase().trim();        
        if (Cb==0) {cfg.cdcall++; Cb=cfg.cdcall;}        
        final Integer[] ii = {0};        
        final Integer[] cb = {Cb}; 
        cfg.setresult(0);
        final Semaphore fse = new Semaphore(0, true);        
        runOnUiThread(new Runnable()
         {
          public void run()
           {
             if (dnm.equals("")) {cfg.setresult(1); fse.release(); return;}
             for (int i = 0; i<200; i++)
               {            
                 if (cfg.dlgname[i][0].equals(dnm))
                  {
                    if (cfg.dlgints[i][19]==0) {ii[0] = i;}  
                    fse.release();              
                    return;
                  }   
               }
             cfg.setresult(2);        
             fse.release();
           }
        });
        try {fse.acquire();} catch (InterruptedException e) { }
        if (cfg.getresult()>0) {SetSysError(623+cfg.getresult(), err, erl, er1, rel, re1); return;}
        
        final Boolean[] dlgvis = {true};
        
        final Semaphore fse2 = new Semaphore(0, true);
        runOnUiThread(new Runnable()
         {
          public void run()
           {           
             if (dnm.equals("")) {cfg.setresult(1); fse.release(); return;}
                                
             Integer cd = cfg.dlgints[ii[0]][4];
                                 
             cfg.dlgints[ii[0]][19]    = 1;
             cfg.dlgints[ii[0]][20]    = 1;
             cfg.dlgints[ii[0]][22]    = 0;
             cfg.dlgcb[ii[0]][0]       = cb[0];
             
             if (((cd & 1073741824)==1073741824) && ((cd & 4)==4) && (md==0))
                {
                    // popup + child + modeless = no remove kbd!
                }
             else
                {                                      
                  cfg.keyboardVis = false;                
                  hidekeyboard();
                  removeNavigationBar(); // only if configured to do so.
                }             
                          
             //=================================================
             Integer dpr = ii[0];
             boolean focusable = true;
             for (int i2 = 1; i2 < 100; i2++)
               {
                 try {
                 if (cfg.dlgstyl[dpr][34][0]==1) 
                   {
                     focusable = false;
                     break;
                   }
                 if (focusable)
                   {                   
                     dpr = cfg.dlghpar[dpr][0];
                     if (dpr==null || dpr<1) {break;}
                     if (cfg.dlgints[dpr][26]==null && cfg.dlgints[dpr][26] != 921) {break;}
                   }
                 } catch (Exception ee) {}                   
               }  
             
             if (((cd & 1073741824)==1073741824) && ((cd & 4)==4) && (md==0))
                {
                    // popup + child + modeless = no focus!                                    
                }
             else if (focusable)
               {
                 cfg.setformactive(ii[0]);
                 cfg.dlgdisp     = ii[0];               
               }  
             //=================================================  
             
             RelativeLayout rl      = null;
             LinearLayout ll        = null;
             
             if (cfg.dlghndl[ii[0]][0] instanceof RelativeLayout)
               {
                 rl = (RelativeLayout) cfg.dlghndl[ii[0]][0];
                 try {((ViewGroup)rl.getParent()).removeView(rl);} catch (Exception e) {}                 
               }
             else if (cfg.dlghndl[ii[0]][0] instanceof LinearLayout)  
               {
                 ll = (LinearLayout) cfg.dlghndl[ii[0]][0];
                 try {((ViewGroup)ll.getParent()).removeView(ll);} catch (Exception e) {}
               }
             else
               {
                 return;
               }

             if ((((cd & 1073741824)==1073741824) || ((cd & 4)==4)) && cfg.dlghpar[ii[0]][0]!=0)
               {                
                 RelativeLayout dp = null;
                 LinearLayout dl = null;
                 if (cfg.dlghndl[cfg.dlghpar[ii[0]][0]][0] instanceof RelativeLayout) 
                   { 
                     dp = (RelativeLayout) cfg.dlghndl[cfg.dlghpar[ii[0]][0]][0];
                   }
                 else if (cfg.dlghndl[cfg.dlghpar[ii[0]][0]][0] instanceof LinearLayout)
                   {
                     dl = (LinearLayout) cfg.dlghndl[cfg.dlghpar[ii[0]][0]][0];
                   }  
                 if (dp!=null || dl!=null)
                   {
                     if ((cd & 4)==4)  // popup
                       {
                         if ((cd & 268435456)!=268435456) 
                           {
                             cfg.ondisplay(ii[0]);
                           }
                           if ((cd & 1073741824) != 1073741824)
                                { 
                                     TextView tv = new TextView(AppContext);
                                     RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                                     params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);                    
                                     params.leftMargin  = 0;
                                     params.topMargin   = 0;
                                     params.width       = 4000;
                                     params.height      = 3000;
                                     tv.setId(20000+ii[0]);
                                     Integer bcl        = 2013265920;
                                     tv.setTextColor(bcl);
                                     tv.setBackgroundColor(bcl);
                                     if (Build.VERSION.SDK_INT>20) {tv.setZ(10000);}
                                     final Boolean cd2 = ((cd & 64)==64);   
                                     tv.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) {PopupCHandler(v, ii[0], cd2);}});
                                     try {((ViewGroup)tv.getParent()).removeView(tv);} catch (Exception e) {}
                                     if ((cd & 268435456)==268435456) {tv.setVisibility(View.INVISIBLE);}
                                     if (dp!=null) {dp.addView(tv, params);}
                                     if (dl!=null) {dl.addView(tv, params);}
                               }
                       }                     
                     RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                     params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);

                     params.width       = cfg.xscaled(cfg.dlgints[ii[0]][2] + 7);
                     params.height      = cfg.yscaled(cfg.dlgints[ii[0]][3] + 7);
                     
                     Integer pax[] = {0};
                     Integer pay[] = {0};                     
                     
                     DialogGetSize(cfg.dlghpar[ii[0]][0], pax, pay);
                     
                     if (pax[0]<1) {pax[0] = cfg.overlay_x[0];}
                     if (pay[0]<1) {pay[0] = cfg.overlay_y[0];}                      
                     
                     if (cfg.dlgints[ii[0]][0]==null) {cfg.dlgints[ii[0]][0] = (int)((pax[0] / 2.0d) - ((cfg.dlgints[ii[0]][2]+4) / 2.0d)); cfg.dlgints[ii[0]][22] += 2;}
                     if (cfg.dlgints[ii[0]][1]==null) {cfg.dlgints[ii[0]][1] = (int)((pay[0] / 2.0d) - ((cfg.dlgints[ii[0]][3]+4) / 2.0d)); cfg.dlgints[ii[0]][22] += 4;}                                              

                     params.leftMargin  = cfg.xscaled(cfg.dlgints[ii[0]][0]);
                     params.topMargin   = cfg.yscaled(cfg.dlgints[ii[0]][1]);
                                          
                     rl.setId(50000+ii[0]);
                     rl.bringToFront();
                     if (dp!=null && rl!=null) {dp.addView(rl, params);}
                     if (dp!=null && ll!=null) {dp.addView(ll, params);}
                     if (dl!=null && rl!=null) {dl.addView(rl, params);}
                     if (dl!=null && ll!=null) {dl.addView(ll, params);}                     
                     rl.bringToFront();
                     if (Build.VERSION.SDK_INT>20) {rl.setZ(10001);}
                   }
                 if ((((cd & 1073741824)==1073741824) || ((cd & 4)==4)) && ((cd & 268435456)==268435456)) // child and invisible.  
                   {
                     dlgvis[0] = false;
                   }
                 else
                   {
                     dlgvis[0] = true; 
                   }                                   
               }
             else
               {
                 RelativeLayout.LayoutParams rp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
                 rp.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);
                 if (rl!=null) {setContentView(rl, rp);}
                 if (ll!=null) {setContentView(ll, rp);}                 
                 cfg.ondisplay(ii[0]);
                 dlgvis[0] = true;
               }             
             
             if (cfg.dlgpar[ii[0]][0].equals(""))
              {  
               SurfaceView tv = new SurfaceView(AppContext);
               RelativeLayout.LayoutParams vp = new RelativeLayout.LayoutParams(0, 0);
               tv.setId(5000);
               tv.setBackgroundColor(Color.parseColor("#00000000"));
               try {((ViewGroup)tv.getParent()).removeView(tv);} catch (Exception e) {}
               if (rl!=null) {rl.addView(tv);}                           
               if (ll!=null) {ll.addView(tv);}                           
              }
            cfg.setresult(0);  
            fse2.release();              
            return;
           }
        });
        try {fse2.acquire();} catch (InterruptedException e) { }        
        
        boolean zready = false;        
        do {
             zready = cfg.sizesready();
             if (!zready) {try {Thread.sleep(30);} catch(Exception e) { }}
           } while (!zready);
        
        // for modal dialogs
        cfg.dlguid++;
        cfg.dlgints[ii[0]][24] = cfg.dlguid;   

        final Semaphore fse3 = new Semaphore(0, true);
        runOnUiThread(new Runnable()
         {
          public void run()
           {
            //cfg.updatecontrols(dnm);
            cfg.hasdialog = true;
            for (int j=0; j<cfg.ctlpar.length; j++) 
              {
               if (cfg.ctlpar[j][0]==Dnm) 
                {
                 if (cfg.ctlstyl[j][28][0]==null) {continue;}
                 if (cfg.ctlstyl[j][28][0]==3)
                  {
                    Integer cid = cfg.getctlid(Dnm, cfg.ctlname[j][0]);
                    RelativeLayout rl = null;
                    LinearLayout ll = null;
                    ListView tv = null;
                    if (cfg.dlghndl[cfg.getctlparent(cid)][0] instanceof RelativeLayout)
                      { 
                        rl = (RelativeLayout) cfg.dlghndl[cfg.getctlparent(cid)][0];
                        if (rl==null) {continue;}
                        tv = (ListView) rl.findViewById(cid);
                      }
                    else if (cfg.dlghndl[cfg.getctlparent(cid)][0] instanceof LinearLayout)
                      {
                        ll = (LinearLayout) cfg.dlghndl[cfg.getctlparent(cid)][0];
                        if (ll==null) {continue;}
                        tv = (ListView) ll.findViewById(cid);
                      }
                    if(tv==null) {continue;}
                    customListviewAdapter ca = (customListviewAdapter) tv.getAdapter();
                    ca.activated = true;
                    tv.invalidateViews();
                  }                
                }               
              }            
     
            if (cfg.dlgpar[ii[0]][0].equals(""))
              {
                RelativeLayout rl = null;
                LinearLayout ll = null;
                SurfaceView tv = null;
                if (cfg.dlghndl[ii[0]][0] instanceof RelativeLayout)
                  { 
                    rl = (RelativeLayout) cfg.dlghndl[ii[0]][0];
                    if (rl!=null) {tv = (SurfaceView) rl.findViewById(5000);}
                    if (tv!=null)
                      {
                        LayoutParams vp = (LayoutParams) tv.getLayoutParams();
                        vp.leftMargin = 0;
                        vp.topMargin  = 0;
                        tv.setLayoutParams(vp);
                      }                    
                  }
                else if (cfg.dlghndl[ii[0]][0] instanceof LinearLayout)
                  {
                    ll = (LinearLayout) cfg.dlghndl[ii[0]][0];
                    if (ll!=null) {tv = (SurfaceView) ll.findViewById(5000);}
                  }

                if (rl!=null) {rl.removeView(tv);}
                if (ll!=null) {ll.removeView(tv);}                  
              }
            cfg.dlgints[ii[0]][31] = 1000;               
            fse3.release();
           }
         });        
        try {fse3.acquire();} catch (InterruptedException e) { }

        // Focus the first focusable textbox available.
        //if (cfg.dlgints[ii[0]][14]>0) {ControlSetFocusPuppet(ii[0], cfg.dlgints[ii[0]][14]);}
        
        final Integer[] noti = {0};
        if (cfg.orientation==1) {noti[0] = -2;}
        if (cfg.orientation==2) {noti[0] = -4;}
        
        DCC[] c = {new DCC()};        
        c[0].formname[0]= cfg.dlgname[ii[0]][0];
        c[0].hwnd[0]    = ii[0];
        c[0].ctlid[0]   = "";                                  
        c[0].callback[0]= cb[0];
        c[0].id[0]      = ii[0];
        c[0].ctype[0]   = 9;
        
        c[0].msg[0]     = 610;
        c[0].wparam[0]  = 3;
        c[0].lparam[0]  = noti[0];
        c[0].widget[0]  = "dialog";
        _Dlgproc(c, c[0].callback[0]);
        
        c[0].msg[0]     = WM_CREATE;
        c[0].lparam[0]  = 0;
        c[0].wparam[0]  = 0;
        c[0].widget[0]  = "dialog";
        _Dlgproc(c, c[0].callback[0]);
        
        cfg.dlgints[ii[0]][26] = 921;
        
        final Semaphore fse4 = new Semaphore(0, true);
        runOnUiThread(new Runnable()
         {
          public void run()
           {      
             RelativeLayout rl = null;
             LinearLayout ll = null;
             if (cfg.dlghndl[ii[0]][0] instanceof RelativeLayout)
               { 
                 rl = (RelativeLayout) cfg.dlghndl[ii[0]][0];
                 if (dlgvis[0]) {rl.setVisibility(View.VISIBLE);} else {rl.setVisibility(View.INVISIBLE);}
               }
             else if (cfg.dlghndl[ii[0]][0] instanceof LinearLayout)
               {
                 ll = (LinearLayout) cfg.dlghndl[ii[0]][0];
                 if (dlgvis[0]) {ll.setVisibility(View.VISIBLE);} else {ll.setVisibility(View.INVISIBLE);}
               }
            fse4.release();
           }
         });        
        try {fse4.acquire();} catch (InterruptedException e) { }
        
        c[0].formname[0]= cfg.dlgname[ii[0]][0];
        c[0].hwnd[0]    = ii[0];
        c[0].ctlid[0]   = "";                                  
        c[0].callback[0]= cb[0];
        c[0].id[0]      = ii[0];
        c[0].ctype[0]   = 9;
        c[0].msg[0]     = WM_CREATED;
        c[0].lparam[0]  = 0;
        c[0].wparam[0]  = 0;
        c[0].widget[0]  = "dialog";
        _Dlgproc(c, c[0].callback[0]);
        
         //Do not remove!
        
        if (md==1) 
          {
            do 
             {
               try {Thread.sleep(300);} catch(InterruptedException e) { }
             } while (cfg.dlgints[ii[0]][24]!=null); // && cfg.dlgints[ii[0]][24]==cfg.dlguid);
          }                
      }
      
      
      
   public Integer PopupCHandler (final View vvv, final Integer dlg, final Boolean cd)
     {
     Thread ttt = new Thread(new Runnable() {
     public void run()
     {
       DCC[] c = {new DCC()};
       c[0].formname[0] = cfg.dlgname[dlg][0];
       c[0].ctlid[0]    = cfg.dlgcapt[dlg][0];       
       c[0].callback[0] = cfg.dlgcb[dlg][0];
       c[0].hwnd[0]     = dlg;
       c[0].isctrl[0]   = false;
       c[0].id[0]       = 20000+dlg;
       c[0].ctype[0]    = 19;
       c[0].msg[0]      = 246; //WM_NCCLICK
       c[0].lparam[0]   = 0;
       c[0].wparam[0]   = 0;
       if (cd) {c[0].wparam[0] = -1;}       
       c[0].widget[0]   = "popup-outside";
       Integer rr = _Dlgproc(c, c[0].callback[0]);
       Thread.currentThread().interrupt(); return;}});
       ttt.start();
       return -1;
     }
    //Ends code from extension 'DIALOGSHOW.bin' (Mainapp)

    //Starts code from extension 'BASDATE.bin' (Mainapp)

    // Returns current date in format DD-MM-YYYY.  
    public String BasDate()//1
      {
          Date dNow = new Date( );
          SimpleDateFormat ft = new SimpleDateFormat ("MM-dd-yyyy");
          return ft.format(dNow);        
      }
    //Ends code from extension 'BASDATE.bin' (Mainapp)

    //Starts code from extension 'CURRENTTIME.bin' (Mainapp)

    // Returns current time in format HH:MM:SS.  
    public String CurrentTime()//1
      {
          Date dNow = new Date();
          SimpleDateFormat ft = new SimpleDateFormat ("HH:mm:ss");
          return ft.format(dNow);        
      }
    //Ends code from extension 'CURRENTTIME.bin' (Mainapp)

    //Starts code from extension 'CREATECUSTOMCONTROL.bin' (Mainapp)

    // This module is not updated by PluriBASIC. You can freely modify it.  
    public Object createCustomControl(final RelativeLayout rl, final RelativeLayout.LayoutParams params, final Integer hh, final Integer id, final String cn, final String cc, final Integer x, final Integer y, final Integer w, final Integer h, final Integer s, final Integer e, final Integer c, final Typeface tf)       //1
      {
        // hh = internal dialog handle.
        // id = internal control id.
        // cn = custom control name.  
        // cc = custom control caption.         
        // x = position x 
        // y = position y 
        // w = width 
        // h = height 
        // s = styles.
        // e = extended styles
        // c = callback module id.
        
        Integer cf[]  = {0, 0, 0};
        String  cdt   = "";
        String  ffl[] = {"", "", ""};        
        
        switch (cn.toLowerCase().trim()) // Names are internally converted to lower case!
          {
            case "examplecustomcontrolname" : 
            
                // This is an example of how to add a control:
                TextView tv = new TextView(AppContext);
                rl.addView(tv, params);
                
                return tv; // Must return the created object!
                
                
            case "timepicker" :
                //#LAYOUT  : timepick = <?xml version="1.0" encoding="utf-8"?><TimePicker xmlns:android="http://schemas.android.com/apk/res/android" android:background="#0B0B0B" android:layout_width="fill_parent" android:layout_height="fill_parent" android:timePickerMode="spinner" />                

                // This is an example of how to add a control from layout:
                LayoutInflater tpinflater = LayoutInflater.from(AppContext);
                //TimePicker tp = (TimePicker)tpinflater.inflate(R.layout.timepick, null);
                TimePicker tp = new TimePicker(new ContextThemeWrapper(AppContext, android.R.style.Theme_Holo_Light_Dialog_NoActionBar));
                
                cdt = CurrentTime();
                
                if (cc!=null)
                  {
                    try
                      {
                        ffl = cc.split(":");
                      }
                    catch (Exception ee) 
                      {
                        ffl = cdt.split(":");
                      }  
                  }
                else
                  {                                        
                    ffl = cdt.split(":");                  
                  }  
                
                if (ffl.length==3)
                  {
                    cf[0] = Integer.valueOf(ffl[0]);
                    cf[1] = Integer.valueOf(ffl[1]);
                    cf[2] = Integer.valueOf(ffl[2]);
                  }   

                tp.setCurrentHour(cf[0]);               
                tp.setCurrentMinute(cf[1]);               
                //tp.setSecond(cf[2]);               
                
                if ((e & 1) == 1) // was %ES_24HOUR extended style included?
                  {
                    // Yes, it was included, do something here.
                    tp.setIs24HourView(true);
                  }
                else
                  {  
                    tp.setIs24HourView(false);
                  }                                  
                
                rl.addView(tp, params);
                
                return tp;
                                
                
            case "datepicker" :
            
                // This is an example of how to add a control from layout:
                LayoutInflater dpinflater = LayoutInflater.from(AppContext);
                DatePicker dp = (DatePicker)dpinflater.inflate(R.layout.datepick, null);
                //DatePicker dp = new DatePicker(new ContextThemeWrapper(AppContext, android.R.style.Theme_Holo_Light_Dialog_NoActionBar));
                
                
                dp.setSpinnersShown(true);
                
                cdt   = BasDate();
                
                if (cc!=null)
                  {
                    try
                      {
                        ffl = cc.split("-");
                      }
                    catch (Exception ee) 
                      {
                        ffl = cdt.split("-");
                      }  
                  }
                else
                  {                                        
                    ffl = cdt.split("-");                  
                  }  
                
                if (ffl.length==3)
                  {
                    cf[0] = Integer.valueOf(ffl[0]) - 1;  // month is base 0.
                    cf[1] = Integer.valueOf(ffl[1]);
                    cf[2] = Integer.valueOf(ffl[2]);
                  }  

                dp.init(cf[2], cf[0], cf[1], null);               
                
                if ((s & 1) == 1) // was %DP_SOMETHING style included?
                  {
                    // Yes, it was included, do something here.
                    
                  }
                  
                if ((e & 1) == 1) // was %ES_SOMETHING extended style included?
                  {
                    // Yes, it was included, do something here.
                    
                  }                                  
                
                rl.addView(dp, params);
                
                return dp;                
                                
            default : 
                return null; // return null for invalid custom controls.
          }
      }
      
    // Returns the text of a custom control.
    // Add your code to make use of CONTROL GET TEXT "yourcustomcontrol" here.  
    public String customControlGetText(View view, String ctlname)
      {
             
        switch (ctlname)
          {
            case "examplecustomcontrolname" :
                return "This is the returned text for this control.";

            case "timepicker" :
                TimePicker tp = (TimePicker) view;
                String ns = "00" + String.valueOf(tp.getCurrentMinute());                
                ns = ns.substring(ns.length()-2);
                return String.valueOf(tp.getCurrentHour()) + ":" + ns + ":00";
                          
            case "datepicker" :
                DatePicker dp = (DatePicker) view;
                return String.valueOf(dp.getMonth()+1) + "-" + String.valueOf(dp.getDayOfMonth()) + "-" + String.valueOf(dp.getYear());
          
            default :
                return "";
          }
      }
      
    // Sets the text of a custom control.
    // Add your code to make use of CONTROL SET TEXT "yourcustomcontrol" here.  
    public int customControlSetText(View view, String ctlname, String newtext)
      {
        String pts[] = {null};
        switch (ctlname)
          {
            case "examplecustomcontrolname" :
                // Implement the text for your control here.
                
            case "timepicker" :
                TimePicker tp = (TimePicker) view;
                
                try 
                 {                
                   pts = newtext.split(":", -1);
                   tp.setCurrentHour(Integer.parseInt(pts[0]));               
                   tp.setCurrentMinute(Integer.parseInt(pts[1]));                   
                   
                   return -1; // Important: return -1 on success.
                 } 
                catch (Exception e) 
                 { 
                   return 0;  
                 }                
                
            case "datepicker" :
                DatePicker dp = (DatePicker) view;
                
                try 
                 {
                   pts = newtext.split("[-]", -1);                   
                   dp.updateDate(Integer.parseInt(pts[2]), (Integer.parseInt(pts[0])-1), Integer.parseInt(pts[1]));
                   return -1; // Important: return -1 on success.
                 } 
                catch (Exception e) 
                 { 
                   return 0;  
                 }     
          
            default :
                return 0;
          }   
      }
      
      
    // Sets the colors of a custom control.
    // Add your code to make use of CONTROL SET COLOR "yourcustomcontrol" here.  
    public int customControlSetColor(View view, String ctlname, Integer forecolor, Integer backcolor)
      {
        switch (ctlname)
          {
            case "examplecustomcontrolname" :
                // Implement the colors for your control here.
                return -1; // Important: return -1 on success.      
          
            default :
                return 0;
          }   
      }              
              
      
    //You can add required classes below this point.
    //Ends code from extension 'CREATECUSTOMCONTROL.bin' (Mainapp)

    //Starts code from extension 'SWAP.bin' (Mainapp)
    // Swaps the values of two variables.  
    public Integer Swap(Object[] ob1, Object[] ob2)//1
      {
        Object hld = ob1[0];
        ob1[0] = ob2[0];
        ob2[0] = hld;
        return -1;
      }
    //Ends code from extension 'SWAP.bin' (Mainapp)

    public Integer otherDefaultActions(DCC[] c)//1
     {
     
        int msg = c[0].msg[0];
        int lparam = c[0].lparam[0];
        int wparam = c[0].wparam[0];
     
       switch (msg)
         {  
            case 700  : // Sensor default delay.
                if (cfg!=null) {return cfg.sendmessage("*", 701, wparam, lparam);}
                break;
            case 3023 :  // PLAY
            case 3024 :  // PAUSE
            case 3025 :  // STOP
            case 3026 :  // SEEK                
              
              break;  

                        
            default : 
              break;  
         }
        return 0;
      }



   private void PrefillArray1(Object[] arr, int dt, Integer s, Integer r)
    {
      if (dt==-5){for (int i=s; i<arr.length; i++) {arr[i] = 0;}}
      else if (dt==-16) {for (int i=s; i<arr.length; i++) {arr[i] = "";}}
      else if (dt==-11) {for (int i=s; i<arr.length; i++) {arr[i] = 0.0;}}
      else if (dt==1) {for (int i=s; i<arr.length; i++) {arr[i] = new RECT();}}
      else if (dt==45) {for (int i=s; i<arr.length; i++) {arr[i] = new POINT();}}
    }
   private void PrefillArray2(Object[][] arr, int dt, Integer s, Integer r)
    {
           if (dt==-5)  {for (int i=s; i<arr.length; i++) {arr[i][0] = 0;}}
      else if (dt==-16) {for (int i=s; i<arr.length; i++) {arr[i][0] = "";}}
      else if (dt==-11) {for (int i=s; i<arr.length; i++) {arr[i][0] = 0.0;}}
      else {for (int i=s; i<arr.length; i++) {PrefillArray1(arr[i], dt, 0, r);}}
    }
   private void RedArr2(Object[][] arr, int dt, Integer s)
    {
           if (dt==-5)  {for (int i=s; i<arr.length; i++) {arr[i] = new Integer[1]; arr[i][0] = 0;}}
      else if (dt==-16) {for (int i=s; i<arr.length; i++) {arr[i] = new String[1]; arr[i][0] = "";}}
      else if (dt==-11) {for (int i=s; i<arr.length; i++) {arr[i] = new Double[1]; arr[i][0] = 0.0;}}
     }
   private void PrefillArray3(Object[][][] arr, int dt, Integer s, Integer r) {for (int i=0; i<arr.length; i++) {PrefillArray2(arr[i], dt, s, r);}}
   private void PrefillArray4(Object[][][][] arr, int dt, Integer s, Integer r) {for (int i=0; i<arr.length; i++) {PrefillArray3(arr[i], dt, s, r);}}
   private void PrefillArray5(Object[][][][][] arr, int dt, Integer s, Integer r) {for (int i=0; i<arr.length; i++) {PrefillArray4(arr[i], dt, s, r);}}
   private void PrefillArray6(Object[][][][][][] arr, int dt, Integer s, Integer r) {for (int i=0; i<arr.length; i++) {PrefillArray5(arr[i], dt, s, r);}}

   private void SetSysError(int er5, int err[], int erl[], Integer er1, int rel[], Integer re1) {err[0]=er5; erl[0]=er1; rel[0]=re1;}

   private void ResetArray(Object arr, int dt, Integer s)
     {
        String   ss = arr.getClass().getName().toLowerCase();
        if (!ss.startsWith("[")) {return;}
        if (!ss.contains("[l")) {return;}
        String[] st = ss.split("[l]");
        if (st==null) {return;}
        Integer  nd = st[0].length();
             if (nd==1) {PrefillArray1((Object[]) arr, dt, s, 1);}
        else if (nd==2) {PrefillArray2((Object[][]) arr, dt, s, 1);}
        else if (nd==3) {PrefillArray3((Object[][][]) arr, dt, s, 1);}
        else if (nd==4) {PrefillArray4((Object[][][][]) arr, dt, s, 1);}
        else if (nd==5) {PrefillArray5((Object[][][][][]) arr, dt, s, 1);}
        else if (nd==6) {PrefillArray6((Object[][][][][][]) arr, dt, s, 1);}
     }
   class dirFISY
     {
       File[]    DIRmf   = null;
       Integer   DIRnf   = 0;
       Integer   DIRmd   = 0;
     }
   class sysFISY
     {
       Object[]  FFobj   = new Object[2048];
       Object[]  FFdev   = new Object[2048];
       Object[]  FFace   = new Object[2048];
       String[]  FFbuff  = new String[2048];
       Integer[] FFslot  = new Integer[2048];
       Integer[] FFmode  = new Integer[2048];
       Integer[] FFacc   = new Integer[2048];
       String[]  cwd     = {""};
       String    rdr     = "";
       private int _iniV = initType();
       protected final int initType()
        {
          cwd[0] = Environment.getExternalStorageDirectory().getAbsolutePath();
          rdr    = cwd[0];
          PrefillArray1(FFbuff, -16, 0, 0);
          PrefillArray1(FFslot, -5, 0, 0);
          return -1;
        }
     }


    class B2pAFC
     {
       String[] strs = {"", "", "", "", "", "", "", ""};
       Integer[] ints = {0, 0, 0, 0, 0, 0, 0, 0};
       public void Reset()
         {
            for (int i = 0; i < 6; i++)
              {
                 strs[i] = "";
                 ints[i] = 0;
              }
         }
     }
    public class RECT implements Cloneable
      {
         public String[] NAME  = {"RECT"};
         public String[] ONAME = {"RECT"};
         public String[] ALIAS = {"RECT"};
         Integer[] top = {0,0}; 
         Integer[] left = {0,0}; 
         Integer[] right = {0,0}; 
         Integer[] bottom = {0,0}; 
         public Integer[] SIZE = {16};
         public String[][] VFLGS = null;
         private int _iniV = initType();

         protected final int initType()
          {
             Integer i = 0;
             VFLGS = new String[4][2];
             VFLGS[0][0] = "top"; VFLGS[0][1] = "&,4,,N,-";
             VFLGS[1][0] = "left"; VFLGS[1][1] = "&,4,,N,-";
             VFLGS[2][0] = "right"; VFLGS[2][1] = "&,4,,N,-";
             VFLGS[3][0] = "bottom"; VFLGS[3][1] = "&,4,,N,-";
             return -1;
          }
        public void getVar(String vn, Object[] nv)//0
          {
            Object obj = null;
            switch (vn.trim())
              {
                case "NAME"          : nv[0] = NAME; break;
                case "ONAME"         : nv[0] = ONAME; break;
                case "ALIAS"         : nv[0] = ALIAS; break;
                case "VFLGS"         : nv[0] = VFLGS; break;
                case "SIZE"          : nv[0] = SIZE; break;                
                case "top" : nv[0]=top; break;
                case "left" : nv[0]=left; break;
                case "right" : nv[0]=right; break;
                case "bottom" : nv[0]=bottom; break;
              }
           }

        @Override
        public Object clone()
          {
            try {return super.clone();} catch (CloneNotSupportedException ee) {return null;}
          }
     }
     
   class POINT implements Cloneable
     {
         public String[] NAME  = {"POINT"};
         public String[] ONAME = {"POINT"};
         public String[] ALIAS = {"POINT"};
         Integer[] x = {0,0}; 
         Integer[] y = {0,0}; 
         Double[] xd = {0.0,0.0}; 
         Double[] yd = {0.0,0.0}; 
         public Integer[] SIZE = {16};
         public String[][] VFLGS = null;
         private int _iniV = initType();

         protected final int initType()
          {
             Integer i = 0;
             VFLGS = new String[4][2];
             VFLGS[0][0] = "x"; VFLGS[0][1] = "&,4,,N,-";
             VFLGS[1][0] = "y"; VFLGS[1][1] = "&,4,,N,-";
             VFLGS[2][0] = "xd"; VFLGS[2][1] = "!,4,,D,-";
             VFLGS[3][0] = "yd"; VFLGS[3][1] = "!,4,,D,-";
             return -1;
          }
        public void getVar(String vn, Object[] nv)
          {
            Object obj = null;
            switch (vn.trim())
              {
                case "NAME"          : nv[0] = NAME; break;
                case "ONAME"         : nv[0] = ONAME; break;
                case "ALIAS"         : nv[0] = ALIAS; break;
                case "VFLGS"         : nv[0] = VFLGS; break;
                case "SIZE"          : nv[0] = SIZE; break;                
                case "x" : nv[0]=x; break;
                case "y" : nv[0]=y; break;
                case "xd" : nv[0]=xd; break;
                case "yd" : nv[0]=yd; break;
              }
           }

        @Override
        public Object clone()
          {
            try {return super.clone();} catch (CloneNotSupportedException ee) {return null;}
          }
     }

//*********************************
    //Starts code from extension 'CONTROLSETOPTION.bin' (Mainapp)


    // Sets the control's user check state. 
    public void ControlSetOption(Integer fid, Object id, final Object minid, final Object maxid)//0
      {      
        if (fid<1) {fid = -fid;}
        final int cid = cfg.getctlid(fid, controlid(id));
        if (cid<1) {return;}                
        final Semaphore fse = new Semaphore(0, true);
        final Runnable trc = new Runnable() 
         {
          @Override
          public void run()       
           {
             
             int minId = 0; 
             int maxId = 99999999; 
             try {minId = (Integer) minid;} catch (Exception e) {}
             try {maxId = (Integer) maxid;} catch (Exception e) {}
                         
             if (cfg.ctlobj[cid][0] instanceof RadioButton)
               {                 
                 for (int i=9; i<cfg.ctlstyl[cid].length; i++)
                   {
                     try {
                         if (i==cid)
                           {
                             RadioButton rb = (RadioButton) cfg.ctlobj[i][0];
                             rb.setChecked(true);
                             cfg.setctlflag(cid, 0x00000001, -1);               
                           }
                         else if ((cfg.ctlpar[cid][0]==cfg.ctlpar[i][0]) && (cfg.ctlstyl[cid][17][0]==cfg.ctlstyl[i][17][0]))
                           {
                             try {
                               int ctlid = Integer.parseInt(cfg.ctlname[i][0]);
                               if (ctlid<minId || ctlid>maxId) {continue;}
                             } catch (Exception f) {}
                           
                             RadioButton rb = (RadioButton) cfg.ctlobj[i][0];
                             rb.setChecked(false);
                             cfg.setctlflag(i, 0x00000001, 0);
                           }
                       } catch (Exception e) {}
                   }     
               }
             fse.release();
           }
         };
        if (cfg.onmainui()) {trc.run();} else {runOnUiThread(trc); try {fse.acquire();} catch (InterruptedException e) { }}              
        return;
      }
    //Ends code from extension 'CONTROLSETOPTION.bin' (Mainapp)

    public Integer b2pRTClickHandler (View v) //1
     {
     final View vv = v;
     Thread ttt = new Thread(new Runnable() {                                                                                
     public void run()                                        
     {
       DCC[] c = {new DCC()};
       String ix1   = (String) vv.getTag();
       if (!vv.isEnabled()) {return;}           
       String[] ix2 = ix1.split("\\*");
       c[0].formname[0]= ix2[0];
       c[0].ctlid[0]   = ix2[1];           
       Integer ii   = cfg.getctlid(cfg.getformid(ix2[0]), ix2[1]);
       if (ii==0) {Thread.currentThread().interrupt(); return;}
       if (_MsgBox) {Thread.currentThread().interrupt(); return;}
       if (cfg.getctlflag(ii, 4)) {Thread.currentThread().interrupt(); return;}
       cfg.setctlflag(ii, 1, 4);           
       c[0].callback[0]= Integer.parseInt(ix2[2]);
       c[0].hwnd[0]    = cfg.getctlparent(ii);       
       if (cfg.ctlcb[ii][0]==0) {c[0].callback[0] = cfg.dlgcb[c[0].hwnd[0]][0];}
       
       if (cfg.ctlobj[ii][0] instanceof RadioButton) {ControlSetOption(c[0].hwnd[0], c[0].ctlid[0], null, null);}       
       
       c[0].isctrl[0]  = true;
       c[0].id[0]      = vv.getId();
       c[0].ctype[0]   = 1;
       c[0].msg[0]     = WM_CLICK;
       c[0].lparam[0]  = 0;
       c[0].wparam[0]  = 0;
       String wi1   = vv.getClass().getName();
       String[] sp  = wi1.split("\\.");
       c[0].widget[0]  = sp[sp.length-1];                                 
       Integer rr = _Dlgproc(c, c[0].callback[0]);
       cfg.setctlflag(ii, 4, 0);
       Thread.currentThread().interrupt(); return;}});
       ttt.start();
       return -1;
     }
     
   public void b2pClickHandler(final View vv) 
     {
       if (_MsgBox) {return;}                  
       Thread ttt = new Thread(new Runnable() {                                                                                
       public void run() {                                    
       String tag   = (String) vv.getTag();               
       String[] tf  = tag.split("\\*");                  
       Integer ii   = Integer.parseInt(tf[3]);
       if (ii==0) {Thread.currentThread().interrupt(); return;}                  
       if (cfg.getctlflag(ii, 4)) {Thread.currentThread().interrupt(); return;}
       cfg.setctlflag(ii, 1, 4);
       DCC[] c = {new DCC()};
       c[0].hwnd[0]    = cfg.getctlparent(ii);
       c[0].callback[0]= cfg.ctlcb[ii][0];
       if (c[0].callback[0]==0) {c[0].callback[0] = cfg.dlgcb[cfg.ctlpar[ii][0]][0];}
       c[0].isctrl[0]  = true;
       c[0].formname[0]= tf[0];
       c[0].ctlid[0]   = tf[1];
       c[0].id[0]      = vv.getId();
       c[0].ctype[0]   = 0;
       c[0].msg[0]     = WM_CLICK;
       c[0].lparam[0]  = 0;
       c[0].wparam[0]  = 0;
       String wi1   = vv.getClass().getName();
       String[] sp  = wi1.split("\\.");
       c[0].widget[0]  = sp[sp.length-1];
       Integer rr = _Dlgproc(c, c[0].callback[0]);
       cfg.setctlflag(ii, 4, 0);
       Thread.currentThread().interrupt();}});
       ttt.start();           
     }

 class sysCFG
     {
       Integer[][] syslong;
       Object[][] dlghndl;
       Object[][] dlgcnvs;
       Integer[][] dlghpar;
       String[][] dlgpar;
       String[][] dlgname;
       String[][] dlgcapt;
       Integer[][] dlguser;
       String[][] dlgfont;
       Integer[][] dlgcb;
       Integer[][] dlgfcol;
       Integer[][] dlgbcol;
       Integer[][] dlgfsiz;
       String[][] dlgtext;
       String[][] dlgtag;
       Integer[][] dlgflgs;
       Integer[][] dlgints;
       Integer[][][] dlgstyl;
       Integer[][] dlgcrts;
       Integer[][] ctlpar;
       Integer[][] ctlid;
       Integer[][] ctlfc;
       Integer[][] ctlbc;
       Integer[][] ctlcb;
       Integer[][] ctllong;
       Integer[][] ctlflgs;
       String[][]  ctlname;
       String[][]  ctltag;
       String[][]  ctlimg;
       String[][]  ctlfont;
       Integer[][] ctlfsiz;
       Integer[][][] ctlstyl;
       Object[][]  ctlobj;
       Object[][]  ctlbmp;
       Integer[] overlay_x = {0};
       Integer[] overlay_y = {0};
       Integer[] overlay_dpi = {0};
       Double[] overlay_dpi_x = {0d};
       Double[] overlay_dpi_y = {0d};
       Integer[] xsize = {0};
       Integer[] ysize = {0};
       Integer[] client_x = {0};
       Integer[] client_y = {0};
       Integer[] screen_x = {0};
       Integer[] screen_y = {0};
       Integer[] screen_dpi = {0};
       Double[] screen_dpi_x = {0d};
       Double[] screen_dpi_y = {0d};
       Double[] pixel_x     = {0d};
       Double[] pixel_y     = {0d};
       String[] lasterror    = {""};
       Integer cdcall        = 10000;
       Integer  display      = 0;
       Integer  dlgccc       = 293;
       Integer  onmodal      = 0;
       Integer  resulting    = 0;
       Object scrl           = null;
       Integer  llvid        = 0;
       Double   gpslat       = 0.0;
       Double   gpslon       = 0.0;
       String   gpscity      = "";
       Integer  gpsfk        = 0;
       Integer  gpson        = 0;
       Integer  gpsgot       = 0;
       Integer  dlgdisp      = 0;
       Integer  captimg      = 0;
       Object   map;
       Boolean  mapready     = false;
       Boolean  hasdialog    = false;
       Object[] dbth;
       Integer  dlguid       = 0;
       Integer  quality      = 300;
       Object   mobj         = null;
       String   mwid         = "";
       String   mtxt         = "";
       String   mttl         = "";
       Double   mlat         = 0.0;
       Double   mlon         = 0.0;
       Double   maplat       = 0.0;
       Double   maplon       = 0.0;
       Double   sensx        = 0.0;
       Double   sensy        = 0.0;
       Double   sensz        = 0.0;
       Boolean  myloc        = false;
       Double   mapzoom      = 0.0;
       Integer  mapmode      = 1;
       Integer  maprotable   = 1;
       Integer  mapdurat     = 1000;
       Integer  mapthick     = 5;
       Double   maplastx     = 0.0;
       Double   maplasty     = 0.0;
       Integer  mapforecolor = 0;
       Integer  mapbackcolor = 0;
       Integer  curturn      = 0;
       Integer  nxtturn      = 0;
       Integer  ctlenum      = 9;
       Integer  curcontrol   = 0;
       Integer BTResult      = 0;
       Integer uninstall     = 0;
       Boolean  initsprites  = false;
       Boolean  minimized    = false;
       Boolean  nomodal      = false;
       Boolean  pauseall     = false;
       Boolean  portrait     = true;
       Context  appctx       = AppContext;
       Integer  mx1          = null;
       Integer  my1          = null;
       Integer  mx2          = null;
       Integer  my2          = null;
       Integer  roundness    = 8;
       Integer  thickness    = 0;
       Integer  bordercolor  = -1118482;
       Integer  backgroundc  = -1118482;
       Integer  orientation  = 0;
       Boolean  keyboardVis  = false;
       Boolean  openGLSupported = false;
       private int _iniV = initType();
       protected final int initType()
        {
          dbth    = new Object[20];
          syslong = new Integer[100][1]; PrefillArray2(syslong, -5, 0, 0);
          dlghndl = new Object[100][1];
          dlgcnvs = new Object[100][1];
          dlghpar = new Integer[100][1]; PrefillArray2(dlghpar, -5, 0, 0);
          dlgpar  = new String[100][1]; PrefillArray2(dlgpar, -16, 0, 0);
          dlgcb   = new Integer[100][1]; PrefillArray2(dlgcb, -5, 0, 0);
          dlguser = new Integer[100][1]; PrefillArray2(dlguser, -5, 0, 0);
          dlgtext = new String[100][1]; PrefillArray2(dlgtext, -16, 0, 0);
          dlgtag  = new String[100][2]; PrefillArray2(dlgtag, -16, 0, 0);
          dlgname = new String[100][1]; PrefillArray2(dlgname, -16, 0, 0);
          dlgcapt = new String[100][1]; PrefillArray2(dlgcapt, -16, 0, 0);
          dlgfont = new String[100][1]; PrefillArray2(dlgfont, -16, 0, 0);
          dlgfcol = new Integer[100][1]; PrefillArray2(dlgfcol, -5, 0, 0);
          dlgbcol = new Integer[100][1]; PrefillArray2(dlgbcol, -5, 0, 0);
          dlgfsiz = new Integer[100][1]; PrefillArray2(dlgfsiz, -5, 0, 0);
          dlgflgs = new Integer[100][1]; PrefillArray2(dlgflgs, -5, 0, 0);
          dlgints = new Integer[100][37]; PrefillArray2(dlgints, -5, 0, 0);
          dlgstyl = new Integer[100][35][3];
          dlgcrts = new Integer[100][1]; PrefillArray2(dlgcrts, -5, 0, 0);
          ctlid   = new Integer[1500][1]; PrefillArray2(ctlid, -5, 0, 0);
          ctlname = new String[1500][1]; PrefillArray2(ctlname, -16, 0, 0);
          ctltag  = new String[1500][1]; PrefillArray2(ctltag, -16, 0, 0);
          ctlimg  = new String[1500][1]; PrefillArray2(ctltag, -16, 0, 0);
          ctllong = new Integer[1500][1]; PrefillArray2(ctllong, -5, 0, 0);
          ctlfont = new String[1500][1]; PrefillArray2(ctlfont, -16, 0, 0);
          ctlfsiz = new Integer[1500][1]; PrefillArray2(ctlfsiz, -5, 0, 0);
          ctlflgs = new Integer[1500][1]; PrefillArray2(ctlflgs, -5, 0, 0);
          ctlpar  = new Integer[1500][1]; PrefillArray2(ctlpar, -5, 0, 0);
          ctlstyl = new Integer[1500][50][4]; PrefillArray3(ctlstyl, -5, 0, 0);
          ctlfc   = new Integer[1500][4];
          ctlbc   = new Integer[1500][4];
          ctlobj  = new Object[1500][1];
          ctlbmp  = new Object[1500][1];
          ctlcb   = new Integer[1500][1]; PrefillArray2(ctlcb, -5, 0, 0);
          final Semaphore fse = new Semaphore(0, true);
          runOnUiThread(new Runnable() {@Override public void run() {initialRL[0].invalidate(); fse.release(); return;}});
          try {fse.acquire();} catch (Exception e) {}
          WindowManager wmd = (WindowManager) AppContext.getSystemService(Context.WINDOW_SERVICE);
          if (wmd==null) {return 0;}
          Display        display = wmd.getDefaultDisplay();
          DisplayMetrics metrics = new DisplayMetrics();
          display.getMetrics(metrics);
          screen_x[0] = metrics.widthPixels;
          screen_y[0] = metrics.heightPixels;
          if (screen_y[0] > screen_x[0]) {orientation = 1;} else {orientation = 2;} // 1 = portrait
          //if (orientation==2 && screen_y[0]>screen_x[0]) {Swap(screen_x, screen_y);}
          //if (orientation==1 && screen_y[0]<screen_x[0]) {Swap(screen_x, screen_y);}
          client_x[0] = screen_x[0];
          client_y[0] = (initialRL[0].getBottom()-initialRL[0].getTop());
          if (screen_y[0]<client_y[0]) {screen_y[0] = client_y[0];}
          Hstatusbar = (screen_y[0] - client_y[0]);
          if (orientation==2) {overlay_x[0]=646;} else {overlay_x[0]=366;}
          if (orientation==2) {overlay_y[0]=366;} else {overlay_y[0]=646;}
          xsize[0] = overlay_x[0];
          ysize[0] = overlay_y[0];
          overlay_dpi[0] = 306;
          overlay_dpi_x[0] = 306d;
          overlay_dpi_y[0] = 306d;
          screen_dpi[0] = metrics.densityDpi;
          pixel_x[0]    = (Double)(double) client_x[0] / overlay_x[0];
          pixel_y[0]    = (Double)(double) client_y[0] / overlay_y[0];
          screen_dpi_x[0] = (double) metrics.xdpi;
          screen_dpi_y[0] = (double) metrics.ydpi;
          return -1;
        }
       public Integer getturn() {this.nxtturn++; return (this.nxtturn-1);}
       public Integer nextturn() {return this.curturn;}
       public void    advturn() {this.curturn++;}

        public Integer i(Object ii)
          {
            Integer iii = 0;
            if (ii instanceof Number) {iii = ((Number)ii).intValue();}
            return iii;
          }
        public Double d(Object ii)
          {
            Double iii = 0.0;
            if (ii instanceof Number) {iii = ((Number)ii).doubleValue();}
            return iii;
          }
        public void namecontrols(Integer rid, String fnm, Integer i)
          {
            if (rid==null) {rid = -1;} else {fnm = "";}

          }

        public void updatecontrols(Integer rid, String fnm, Integer fid)
          {
            String fnm2 = fnm;
            if (rid==null) {rid = -1;} else {fnm2 = fnm + String.valueOf(rid); fnm = "";}

            this.sizecodectls(rid, fnm2, fid);
          }

        public void sizecodectls(Integer rid, String fnm, Integer fid)
          {
            if (fnm.equals("")) {fnm = "xmlform" + String.valueOf(rid);}
            if (this.isformsized(fid)) {return;}
            if (fid==-1) {return;}
            for (int i = 0; i<this.ctlid.length-1; i++)
              {
               if (ctlid[i][0]>0)
                {
                 if (ctlpar[i][0]==fid)
                  {
                    this.setsize(fid, ctlid[i][0]);
                  }
                }
              }
            this.setformsized(fid);
            return;
          }

        public int xscaled(Integer x)
          {
            return (int) (this.pixel_x[0] * x);
          }

        public int yscaled(Integer y)
          {
            return (int) (this.pixel_y[0] * y);
          }

        public int xredux(Integer x)
          {
            if (x<1) {return 0;}
            return (int) (x / this.pixel_x[0]);
          }

        public int yredux(Integer y)
          {
            if (y<1) {return 0;}
            return (int) (y / this.pixel_y[0]);
          }

        public void setsize(Integer fid, Integer id)
          {
            View v = null;
            if (cfg.dlghndl[fid][0] instanceof RelativeLayout)
              {
                RelativeLayout rl = (RelativeLayout) cfg.dlghndl[fid][0];
                if (rl==null) {return;}
                v = (View) rl.findViewById(id);
              }
            else {return;}
            if (v==null) {return;}
            String[] sz = ((String) v.getTag()).split("[\0 ]");
            RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) v.getLayoutParams();
            v.setTag(sz[5]);
            lp.width        = this.xscaled(Integer.parseInt(sz[0]));
            lp.height       = this.yscaled(Integer.parseInt(sz[1]));
            lp.leftMargin   = this.xscaled(lp.leftMargin);
            lp.topMargin    = this.yscaled(lp.topMargin);
            v.setLayoutParams(lp);
          }

        public boolean sizesready()
          {
            if (this.client_x[0]>0) {return true;}
            for (int i = 0; i<dlgname.length-1; i++)
              {
                if (this.dlghndl[i][0]!=null)
                  {
                    if (this.dlghndl[i][0] instanceof RelativeLayout)
                      {
                        RelativeLayout dh = (RelativeLayout) this.dlghndl[i][0];
                        if (dh==null) {continue;}
                        this.client_x[0] = dh.getRight() - dh.getLeft();
                        this.client_y[0] = dh.getBottom() - dh.getTop();
                        if (this.client_x[0]>0) {return true;} else {return false;}
                      }
                  }
              }
            return false;
          }
        public void updatesize(String dnm)
          {
            int p  = -1; 
            int i  = 0; 
            if (dnm.equals(""))
              {
                for (i = (dlgname.length-1); i>0; i--)
                  {
                    if (this.dlghndl[i][0]!=null) {p = i; break;}
                  }
              }
             else
              {
                for (i = 0; i<(dlgname.length-1); i++)
                  {
                    if (dlgname[i][0].toLowerCase().equals(dnm.trim().toLowerCase())) {p = i; break;}
                  }
              }
            if (p==-1) {return;}
            this.sizesready();
            if (this.dlghndl[p][0]==null) {return;}
            if (this.dlghndl[i][0] instanceof RelativeLayout)
              {
                RelativeLayout dh = (RelativeLayout) this.dlghndl[p][0];
                if (dh==null) {return;}
                this.client_x[0] = dh.getRight() - dh.getLeft();
                this.client_y[0] = dh.getBottom() - dh.getTop();
              }
            if (this.client_x[0]>0) {}
              {
                this.updatecontrols(null, dnm, p);
              }
            return;
          }
        public Integer gethwnd(Integer fn)
          {
            for (int i = 0; i<dlgname.length-1; i++)
              {
                if (dlgcb[i][0]==fn) {return i;}
              }
            return 0;
          }
        public void setdlgtext(String fn, String txt)
          {
            int i = this.getformid(fn);
            if (i==-1) {return;}
            dlgtext[i][0] = txt;
          }
        public String getdlgtext(String fn)
          {
            int i = this.getformid(fn);
            if (i==-1) {return "";}
            if ((dlgflgs[i][0] & 0x0002)!=0x0002) {return "";}
            return dlgtext[i][0];
          }
        public void setdlgfont(String fn, String font, Integer fcol, Integer fsiz)
          {
            int i = this.getformid(fn);
            if (i==-1) {return;}
            dlgfont[i][0] = font;
            dlgfcol[i][0] = fcol;
            dlgfsiz[i][0] = fsiz;
          }
        public void getdlgfont(String fn, String[] font, Integer[] fcol, Integer[] fsiz)
          {
            font[0] = "default";
            fcol[0] = 0;
            fsiz[0] = 18;
            int i = this.getformid(fn);
            if (i==-1) {return;}
            font[0] = dlgfont[i][0];
            fcol[0] = dlgfcol[i][0];
            fsiz[0] = dlgfsiz[i][0];
          }
        public void setctlfont(Integer fid, String cn, String font, Integer fcol, Integer fsiz)
          {
            int i = this.getctlid(fid, cn);
            if (i==-1) {return;}
            ctlfont[i][0] = font;
            ctlfc[i][0]   = fcol;
            ctlfsiz[i][0] = fsiz;
          }
        public void getctlfont(Integer fid, String fn, String[] font, Integer[] fcol, Integer[] fsiz)
          {
            font[0] = "default";
            fcol[0] = 0;
            fsiz[0] = 18;
            int i = this.getctlid(fid, fn);
            if (i==-1) {return;}
            font[0] = ctlfont[i][0];
            fcol[0] = ctlfc[i][0];
            fsiz[0] = ctlfsiz[i][0];
          }
        public void setdlguser(String fn, Integer usr)
          {
            int i = this.getformid(fn);
            if (i==-1) {return;}
            dlguser[i][0] = usr;
          }
        public Integer getdlguser(String fn, Integer usr)
          {
            int i = this.getformid(fn);
            if (i==-1) {return 0;}
            if ((dlgflgs[i][0] & 0x0002)!=0x0002) {return 0;}
            return dlguser[i][0];
          }
        public boolean isformsized(Integer i)
          {
            if (i==-1) {return true;}
            return ((dlgflgs[i][0] & 0x0001)==0x0001);
          }
        public void setformsized(Integer i)
          {
            if (i==-1) {return;}
            dlgflgs[i][0] = (dlgflgs[i][0] | 0x0001);
          }
        public Boolean onmainui()
          {
            return Looper.myLooper() == Looper.getMainLooper();
          }
        public void handleclosedialog(Integer i)
          {
            if (i<1) {return;}
            DialogEnd(i, new int[1], new int[1], 0, new int[1], 0);
            //for (int ii = 0; ii<dlgcrts.length-1; ii++)
            //  {
            //    if (dlgcrts[ii][0]==null) {continue;}
            //    if (dlgcrts[ii][0]!=0) {return;}
            //  }
          }
        public boolean isformactive(Integer i)
          {
             return ((dlgflgs[i][0] & 0x0002)==0x0002);
          }
        public void setformactive(Integer i)
          {
            if (i==-1) {return;}
            dlgflgs[i][0] = (dlgflgs[i][0] | 0x0002);
          }

        public Integer setdata(String name, Integer p, Integer id, Integer cc)
          { 
            if (p==-1) {return 0;}
            for (Integer i = 10; i<this.ctlid.length; i++)
              {
               if (ctlid[i][0]!=0)
                {
                 if (ctlpar[i][0]==p && ctlname[i][0].equals(name.trim().toLowerCase())) {return 0;}
                }
              }
            for (Integer i = 10; i<this.ctlid.length; i++)
              {
               if (ctlid[i][0]<1)
                 {
                   ctlname[i][0]    = name.trim().toLowerCase();
                   if (id==0) {id=i;} else {this.setVDkeylistener(p, id, i, cc);}
                   ctlpar[i][0]     = p;
                   ctlid[i][0]      = id;
                   PrefillArray2(cfg.ctlstyl[i], -5, 0, 0);
                   return id;
                 }
              }
            return 0;
          }

        public void setVDkeylistener(Integer p, Integer id, final Integer ii, Integer cc)
          { 
            View v = null;
            if (cfg.dlghndl[p][0] instanceof RelativeLayout)
              {
                RelativeLayout rl = (RelativeLayout) cfg.dlghndl[p][0];
                if (rl==null) {return;}
                v = (View) rl.findViewById(id);
              }
            else if (cfg.dlghndl[p][0] instanceof LinearLayout)
              {
                LinearLayout ll = (LinearLayout) cfg.dlghndl[p][0];
                if (ll==null) {return;}
                v = (View) ll.findViewById(id);
              }
            if (v==null) {return;}
            String tg = ((String) v.getTag()); 
            tg += "\0 " + cfg.dlgname[p][0] + "*" + cfg.ctlname[ii][0] + "*" + String.valueOf(cc) + "*" + String.valueOf(ii); 
            v.setTag(tg); 
            cfg.ctlcb[ii][0] = cc;
            cfg.ctlobj[ii][0] = v;
            if (v instanceof Button)
             {
               v.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) {b2pClickHandler(v);}});
             }
            else if (v instanceof EditText)
             {
               v.setOnKeyListener(new View.OnKeyListener()
                {
                 @Override
                 public boolean onKey(View v, int keyCode, KeyEvent event)
                  {
                    if (_MsgBox) {return false;}
                    DCC[] c = {new DCC()};
                    if (!v.isEnabled()) {return false;}
                    final Integer[] cm = {0};
                    if (event.getAction()==KeyEvent.ACTION_DOWN) {cm[0] = WM_KEYDOWN;}
                    if (event.getAction()==KeyEvent.ACTION_UP) {cm[0] = WM_KEYUP;}
                    String tag   = (String) v.getTag();
                    String[] tf  = tag.split("\\*");
                    Integer ii   = Integer.parseInt(tf[3]);
                    c[0].hwnd[0]    = cfg.getctlparent(ii);
                    c[0].callback[0]= cfg.ctlcb[ii][0];
                    if (cfg.ctlcb[ii][0]==0) {c[0].callback[0] = cfg.dlgcb[cfg.getctlparent(ii)][0];}
                    c[0].isctrl[0]  = true;
                    c[0].formname[0]= cfg.getformname(cfg.getctlparent(ii));
                    c[0].hwnd[0]    = cfg.getctlparent(ii);
                    c[0].ctlid[0]   = tf[1];
                    c[0].id[0]      = v.getId();
                    c[0].ctype[0]   = 0;
                    c[0].msg[0]     = cm[0];
                    c[0].lparam[0]  = keyCode;
                    c[0].wparam[0]  = 0;
                    c[0].widget[0]  = "textbox";
                    return _Dlgproc(c, c[0].callback[0])!=0;
                  }
              });
             }
            else if (v instanceof ListView)
             {
              final ListView v2 = (ListView) v;
              v2.setOnItemClickListener(new OnItemClickListener(){
              @Override
              public void onItemClick(AdapterView<?> arg0, View v, int A1, long A2) {
                  if (_MsgBox) {return;}
                  final View vv = v2;
                  if (!vv.isEnabled()) {return;}
                  final int a1 = A1;
                  final Integer a2 = (int) (long) A2;
                  Thread ttt = new Thread(new Runnable() {
                  public void run() {
                       try {
                       DCC[] c = {new DCC()};
                       String tag   = (String) vv.getTag();
                       String[] tf  = tag.split("\\*");
                       Integer ii   = Integer.parseInt(tf[3]);
                       if (ii==0) {Thread.currentThread().interrupt(); return;}
                       if (cfg.getctlflag(ii, 2)) {Thread.currentThread().interrupt(); return;}
                       cfg.setctlflag(ii, 2, 1);
                       c[0].hwnd[0]    = cfg.getctlparent(ii);
                       c[0].callback[0]= cfg.ctlcb[ii][0];
                       if (cfg.ctlcb[ii][0]==0) {c[0].callback[0] = cfg.dlgcb[cfg.getctlparent(ii)][0];}
                       c[0].isctrl[0]  = true;
                       c[0].formname[0]= cfg.getformname(cfg.getctlparent(ii));
                       c[0].ctlid[0]   = tf[1];
                       c[0].hwnd[0]    = cfg.getctlparent(ii);
                       c[0].id[0]      = vv.getId();
                       c[0].ctype[0]   = 2;
                       c[0].msg[0]     = WM_CLICK;
                       c[0].lparam[0]  = a1;
                       c[0].wparam[0]  = a2;
                       c[0].widget[0]  = "listview";
                       _Dlgproc(c, c[0].callback[0]);
                       cfg.setctlflag(ii, 2, 0);
                       } catch (Exception ee) { }
                       }});
                   ttt.start();
                   return;
               }});
             }
          }

        public String getformname(Integer id)
          {
            if (id<1) {return "";}
            if (id>this.dlgname.length) {return "";}
            return this.dlgname[id][0];
          }
        public Integer getformid(String fn)
          {
            for (int i = 0; i<dlgname.length-1; i++)
              {
                if (dlgname[i][0].equals(fn)) {return i;}
              }
            return -1;
          }

        public boolean delcontrols(Integer id)
          { 
            if (id<0) {return false;}
            if (id>dlgname.length) {return false;}
            for (int i = 0; i<ctlpar.length; i++) 
              {
                if (ctlpar[i][0]==id)
                  {
                    this.resetctl(i);
                  }
              }
            return true;
          }
        public void resetctl(Integer i)
          { 
            if (i<1) {return;}
            ctlid[i][0]   = 0;
            ctlobj[i][0]  = null;
            ctlname[i][0] = "";
            ctlpar[i][0]  = 0;
            ctltag[i][0]  = "";
            ctlimg[i][0]  = "";
            ctllong[i][0] = 0;
            ctlfont[i][0] = "";
            ctlfsiz[i][0] = 0;
            ctlflgs[i][0] = 0;
            ctlfc[i][0]   = 0;
            ctlbc[i][0]   = null;
            ctlfc[i][1]   = 0;
            ctlbc[i][1]   = null;
            for (int j=0; j<49; j++) {cfg.ctlstyl[i][j][0] = 0; cfg.ctlstyl[i][j][1] = 0;}
            return;
          }
        public Integer getctlid(Integer id, String name)
          {
            String nm = name.trim().toLowerCase();
            for (int i = 0; i<ctlname.length; i++)
              {
                if (ctlpar[i][0]==id)
                 {
                   if (ctlname[i][0].toLowerCase().equals(nm))
                     {
                       //return ctlid[i][0];}
                       return i;
                     }
                 }
              }
            return 0;
          }
        public Integer getsysid(Integer id)
          {
            return ctlid[id][0];
          }
        public String getctlname(Integer did, Integer id)
          {
            return ctlname[id][0];
          }
        public Integer getctlparent(Integer id)
          {
            return ctlpar[id][0];
          }
        public String getctltag(Integer id)
          {
            return ctltag[id][0];
          }
        public void setctltag(Integer id, String nt)
          {
            ctltag[id][0] = nt; return;
          }
        public String getctlimg(Integer id)
          {
            for (int i = 0; i<ctlid.length; i++)
              {
                if (ctlid[i][0]==id) {return ctlimg[i][0];}
              }
            return "";
          }
        public void setctlimg(Integer id, String nt)
          {
            for (int i = 0; i<ctlid.length; i++)
              {
                if (ctlid[i][0]==id) {ctlimg[i][0] = nt; return;}
              }
          }
        public Integer getctllong(Integer id)
          {
            for (int i = 0; i<ctlid.length; i++)
              {
                if (ctlid[i][0]==id) {return ctllong[i][0];}
              }
            return 0;
          }
        public void setctllong(Integer id, Integer nl)
          {
            for (int i = 0; i<ctlid.length-1; i++)
              {
                if (ctlid[i][0]==id) {ctllong[i][0] = nl; return;}
              }
          }
        public boolean getctlflag(Integer id, Integer flg)
          {
            for (int i = 0; i<ctlid.length; i++)
              {
                if (ctlid[i][0]==id) {return ((ctlflgs[i][0] & flg)==flg);}
              }
            return false;
          }
        public void setctlflag(Integer id, Integer flg, Integer st)
          {
            for (int i = 0; i<ctlid.length-1; i++)
              {
                if (st==0)
                  {
                    if (ctlid[i][0]==id) {ctlflgs[i][0] = (ctlflgs[i][0] & (~ flg)); return;}
                  }
                else
                  {
                    if (ctlid[i][0]==id) {ctlflgs[i][0] = ctlflgs[i][0] | flg; return;}
                  }
              }
          }
        public void setctlcolor(Integer i, Integer fc, Integer bc)
          {
            if (fc!=null) {ctlfc[i][0] = fc;}
            if (bc!=null) {ctlbc[i][0] = bc;}
          }
        public void getctlcolor(Integer i, Integer[] fc, Integer[] bc)
          {
            fc[0] = ctlfc[i][0]; bc[0] = ctlbc[i][0]; return;
          }
        public Object dialogparent(Integer id)
          {
            if (id==null) {return null;}
            for (int i = 0; i<ctlid.length-1; i++)
              {
                if (ctlid[i][0]==id) {return this.dlghndl[ctlpar[i][0]][0];}
              }
            return null;
          }
        public void setlasterror(String le)
          {
            this.lasterror[0] = le;
          }
        public String getlasterror()
          {
            return this.lasterror[0];
          }
        public void setresult(Integer rs)
          {
            this.resulting = rs;
          }
        public Integer getresult()
          {
            return this.resulting;
          }
        public void on (Integer i)
          {
            this.display = i;
          }
        public Integer getcurc()
          {
            if (this.display==null) {return 0;}
            if (this.display<0)     {return 0;}
            if (this.display>99)  {return 0;}
            return this.dlgcb[this.display][0];
          }
        public Integer getcb(Integer dlg)
          {
            if (dlg==null) {return 0;}
            if (dlg<0 || dlg>99)  {return 0;}
            return this.dlgcb[dlg][0];
          }
        public boolean displaying(Integer did)
          {
            return this.display==did;
          }
        public void ondisplay(Integer did)
          {
            this.display = did;
          }
        public Integer sendmessage(Object fn, int msg, int wparam, int lparam)
          {
            return this.systemsendmessage(fn, msg, wparam, lparam, "", null, null);
          }
        public Integer systemsendmessage(Object fn, int msg, int wparam, int lparam, String text, Intent intent, Object obj)
          {
            Integer cid = 0;
            String  cis = "";
            if (fn instanceof String) {cis = (String) fn;}
            if (fn instanceof Integer) {cid = (Integer) fn;}
            if (fn instanceof Double) {cid = ((Double) fn).intValue();}
            DCC[] c = {new DCC()};
            c[0].hwnd[0]   = 0;
            c[0].id[0]      = cid;
            c[0].ctype[0]   = 1500;
            c[0].msg[0]     = msg;
            c[0].wparam[0]  = wparam;
            c[0].lparam[0]  = lparam;
            c[0].tag[0]     = this.mtxt;
            c[0].title[0]   = this.mttl;
            c[0].text[0]    = text;
            c[0].intent[0]  = intent;
            c[0].latitude[0] = this.mlat;
            c[0].longitude[0] = this.mlon;
            c[0].widget[0]    = this.mwid;
            if (obj!=null) {c[0].object[0] = obj;} else {c[0].object[0] = this.mobj;}
            this.mlat = 0.0;
            this.mlon = 0.0;
            this.mtxt = "";
            this.mttl = "";
            this.mwid = "";
            this.mobj = null;
            if (cis.equals("@"))
              {
                c[0].hwnd[0]     = 92;
                c[0].callback[0] = this.dlgcb[c[0].hwnd[0]][0];
              }
            else if (cis.equals("#"))
              {
                if (this.dlgdisp<1) {return 0;}
                if (this.dlgdisp>99) {return 0;}
                c[0].hwnd[0]     = this.dlgdisp;
                c[0].callback[0] = this.dlgcb[c[0].hwnd[0]][0];
              }
            else if (cis.equals("*"))
              {
                if (this.display<1) {return 0;}
                if (this.display>99) {return 0;}
                for (int i = 0; i<this.dlgcb.length; i++)
                  {
                    if (this.dlgints[i][26]!=null && this.dlgints[i][26]==921)
                      {
                        c[0].hwnd[0]     = i;
                        c[0].callback[0] = this.dlgcb[i][0];
                        if (c[0].callback[0]<1) {continue;}
                        _Dlgproc(c, c[0].callback[0]);
                      }
                  }
                return 0;
              }
            else if (cid>0)
              {
                if (cid<1) {return 0;}
                if (cid>99) {return 0;}
                c[0].hwnd[0]     = cid;
                c[0].callback[0] = this.dlgcb[c[0].hwnd[0]][0];
             }
            if (c[0].callback[0]<1) {return 0;}
            return _Dlgproc(c, c[0].callback[0]);
          }
        public void sysactions(DCC[] c, Integer[] a)
          {
            if (a[0]==0)
              {
                 //if (c.msg[0]==274 && c[0].wparam[0]==61536) {android.os.Process.killProcess(android.os.Process.myPid());}
                 if (c[0].msg[0]==256 && c[0].wparam[0]==66 && cfg.ctlstyl[c[0].id[0]][49][0]>0) {ControlSetFocusPuppet(c[0].hwnd[0], cfg.ctlstyl[c[0].id[0]][49][0]); return;}
                 if (c[0].msg[0]==274 && c[0].wparam[0]==61536) {this.handleclosedialog(this.gethwnd(c[0].callback[0])); return;}
                 if (c[0].msg[0]==246 && c[0].wparam[0]==-1) {this.handleclosedialog(c[0].hwnd[0]); return;}
                 a[0] = otherDefaultActions(c);
              }
          }
     }
   class DCC
     {
        Integer[] hwnd = {0};
        String[]  formname = {""};
        String[]  ctlid = {""};
        Integer[] callback = {0};
        Boolean[] isctrl = {false};
        Integer[] id = {0};
        Integer[] lparam = {0};
        Integer[] wparam = {0};
        Integer[] xparam = {0};
        Integer[] startx = {0,0,0,0,0,0,0,0,0,0,0,0};
        Integer[] starty = {0,0,0,0,0,0,0,0,0,0,0,0};
        Integer[] x      = {0,0,0,0,0,0,0,0,0,0,0,0};
        Integer[] y      = {0,0,0,0,0,0,0,0,0,0,0,0};
        Integer[] dialogx   = {0,0,0,0,0,0,0,0,0,0,0,0};
        Integer[] dialogy   = {0,0,0,0,0,0,0,0,0,0,0,0};
        Integer[] canvasx   = {0,0,0,0,0,0,0,0,0,0,0,0};
        Integer[] canvasy   = {0,0,0,0,0,0,0,0,0,0,0,0};
        Double[] xsensor    = {0.0d};
        Double[] ysensor    = {0.0d};
        Double[] zsensor    = {0.0d};
        Double[] degrees    = {0.0d};
        Double[]  latitude  = {0.0};
        Double[]  longitude = {0.0};
        Integer[] count  = {0};
        Integer[] msg    = {0};
        Integer[] code    = {0};
        Double[]  velx   = {0.0d};
        Double[]  vely   = {0.0d};
        String[]  title  = {""};
        Intent[]  intent = {null};
        String[]  tag    = {""};
        String[]  text   = {""};
        Integer[] value  = {0};
        Double[]  dval    = {0.0d};
        Object[]  object = {null};
        RelativeLayout[] rl = {null};
        View[]    view = {null};
        Integer[] ctype = {0};
        String[] widget = {""};
     }


}