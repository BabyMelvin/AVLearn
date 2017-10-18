package com.test.learnav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void drawPicture(View view) {
        //ImageView,SurfaceView,自定义View完成图片绘制
    }

    public void recordAndPlayerAudio(View view) {
        //AudioRecord和AudioTrack API完成音频PCM数据和采集播放，并实现读写音频wav文件
    }

    public void cameraApi(View view) {
        //Camera API进行视频采集，分别采用SurfaceView,TextureView,预览Camera数据,取到NV21数据回调。
    }

    public void coAndDecMp4(View view) {
        //MediaExtractor和MediaMuxer 解析和封装MP4
   }

    public void openGLDrawAngle(View view) {
        //OpenGL ES api,绘制三角形
    }

    public void openGLDrawPicture(View view) {
        //学习纹理绘制，能够使用OpenGL显示一张图片
    }
    public void AACHardCoAndDec(View view) {
        //学习MediaCodec API 完成音频AAC硬编和硬解
    }

    public void H264HardCoAndDec(View view) {
        //学习MediaCodec API 完成H264硬编，硬解
    }

    public void fullAVProcess(View view) {
        //音视频播放流程，完成mp4解析，音视频解析，播放和渲染
    }
    public void openGLImprove(View view) {
        //了解实现视频剪裁、旋转、水印、滤镜、并学习OpenGL 高级特性：VBO，VAO，FBO等。
    }
    public void GLSurfaceCamera(View view) {
        //图形图像框架，使用GLSurfaceView绘制Camera预览画面
    }
    public void proxy(View view) {
        //音视频相关网络协议,rtmp,hls,以及封装格式：mp4,flv
    }
    public void openSource(View view) {
        //学习音视频领域开源项目webrtc,ffmpeg,ijkplayer,librtmp
    }
    public void shortMediaEdit(View view) {
        //ffmpeg库移植到Android平台，编写一款简易音视频播放器
    }
    public void H264SoftCod(View view) {
        //x264库移植到Android平台，视频数据H264软编码功能
    }
    public void librtmp(View view) {
        //完成Android RTMP软编功能
    }
    public void mediaPlayer(View view) {
        //短视频制作APP：断点拍摄、添加水印、本地转码、视频剪辑、视频拼接、MV特效等功能
    }


}
