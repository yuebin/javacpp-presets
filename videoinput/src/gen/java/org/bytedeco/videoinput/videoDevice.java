// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.videoinput;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.videoinput.global.videoInputLib.*;



////////////////////////////////////////   VIDEO DEVICE   ///////////////////////////////////

@NoOffset @Properties(inherit = org.bytedeco.videoinput.presets.videoInputLib.class)
public class videoDevice extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public videoDevice(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public videoDevice(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public videoDevice position(long position) {
        return (videoDevice)super.position(position);
    }


		public videoDevice() { super((Pointer)null); allocate(); }
		private native void allocate();
		public native void setSize(int w, int h);
		public native void NukeDownstream(IBaseFilter pBF);
		public native void destroyGraph();

		public native int videoSize(); public native videoDevice videoSize(int videoSize);
		public native int width(); public native videoDevice width(int width);
		public native int height(); public native videoDevice height(int height);
		public native int tryWidth(); public native videoDevice tryWidth(int tryWidth);
		public native int tryHeight(); public native videoDevice tryHeight(int tryHeight);

		public native ICaptureGraphBuilder2 pCaptureGraph(); public native videoDevice pCaptureGraph(ICaptureGraphBuilder2 pCaptureGraph);	// Capture graph builder object
		public native IGraphBuilder pGraph(); public native videoDevice pGraph(IGraphBuilder pGraph);					// Graph builder object
	    public native IMediaControl pControl(); public native videoDevice pControl(IMediaControl pControl);				// Media control object
		public native IBaseFilter pVideoInputFilter(); public native videoDevice pVideoInputFilter(IBaseFilter pVideoInputFilter);  		// Video Capture filter
		public native IBaseFilter pGrabberF(); public native videoDevice pGrabberF(IBaseFilter pGrabberF);
		public native IBaseFilter pDestFilter(); public native videoDevice pDestFilter(IBaseFilter pDestFilter);
		public native IAMStreamConfig streamConf(); public native videoDevice streamConf(IAMStreamConfig streamConf);
		public native ISampleGrabber pGrabber(); public native videoDevice pGrabber(ISampleGrabber pGrabber);    			// Grabs frame
		public native @Cast("AM_MEDIA_TYPE*") _AMMediaType pAmMediaType(); public native videoDevice pAmMediaType(_AMMediaType pAmMediaType);

		public native IMediaEventEx pMediaEvent(); public native videoDevice pMediaEvent(IMediaEventEx pMediaEvent);

		public native @ByRef @Cast("GUID*") Pointer videoType(); public native videoDevice videoType(Pointer videoType);
		public native @Cast("long") int formatType(); public native videoDevice formatType(int formatType);

		public native SampleGrabberCallback sgCallback(); public native videoDevice sgCallback(SampleGrabberCallback sgCallback);

		public native @Cast("bool") boolean tryDiffSize(); public native videoDevice tryDiffSize(boolean tryDiffSize);
		public native @Cast("bool") boolean useCrossbar(); public native videoDevice useCrossbar(boolean useCrossbar);
		public native @Cast("bool") boolean readyToCapture(); public native videoDevice readyToCapture(boolean readyToCapture);
		public native @Cast("bool") boolean sizeSet(); public native videoDevice sizeSet(boolean sizeSet);
		public native @Cast("bool") boolean setupStarted(); public native videoDevice setupStarted(boolean setupStarted);
		public native @Cast("bool") boolean specificFormat(); public native videoDevice specificFormat(boolean specificFormat);
		public native @Cast("bool") boolean autoReconnect(); public native videoDevice autoReconnect(boolean autoReconnect);
		public native int nFramesForReconnect(); public native videoDevice nFramesForReconnect(int nFramesForReconnect);
		public native @Cast("unsigned long") int nFramesRunning(); public native videoDevice nFramesRunning(int nFramesRunning);
		public native int connection(); public native videoDevice connection(int connection);
		public native int storeConn(); public native videoDevice storeConn(int storeConn);
		public native int myID(); public native videoDevice myID(int myID);
		public native @Cast("long") int requestedFrameTime(); public native videoDevice requestedFrameTime(int requestedFrameTime); //ie fps

		public native @Cast("char") byte nDeviceName(int i); public native videoDevice nDeviceName(int i, byte nDeviceName);
		@MemberGetter public native @Cast("char*") BytePointer nDeviceName();
		public native @Cast("WCHAR") char wDeviceName(int i); public native videoDevice wDeviceName(int i, char wDeviceName);
		@MemberGetter public native @Cast("WCHAR*") CharPointer wDeviceName();

		public native @Cast("unsigned char*") BytePointer pixels(); public native videoDevice pixels(BytePointer pixels);
		public native @Cast("char*") BytePointer pBuffer(); public native videoDevice pBuffer(BytePointer pBuffer);

}
