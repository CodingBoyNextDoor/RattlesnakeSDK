package com.rattlesnakesdk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import static android.os.FileUtils.copy;
import static org.junit.Assert.*;

public class PoseEstimationFloatInceptionTest {


    @Test
    public void classifyFrame() throws IOException {
        System.out.println("unitTest1");
        PoseEstimation poseEstimation=new PoseEstimationFloatInception();
        System.out.println("unitTest2");
        Bitmap bitmap=BitmapFactory.decodeStream(getClass().getResourceAsStream("photo\\test1.jpg"));
        System.out.println("unitTest3");
        poseEstimation.classifyFrame(bitmap);
        float[][] point=poseEstimation.mPrintPointArray;
        for(int i=0;i<14;i++){
            System.out.println("坐标：（"+Float.toString(point[0][i])+","+Float.toString(point[1][i])+")");
        }
    }
}