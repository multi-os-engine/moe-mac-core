/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package mac.quartzcore.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import mac.coregraphics.struct.CGAffineTransform;
import mac.quartzcore.struct.CATransform3D;

@Generated
@Library("QuartzCore")
@Runtime(CRuntime.class)
public final class QuartzCore {
	static {
		NatJ.register();
	}

	@Generated
	private QuartzCore() {
	}

	@Generated
	@CFunction
	public static native double CACurrentMediaTime();

	@Generated
	@CFunction
	public static native boolean CATransform3DIsIdentity(
			@ByValue CATransform3D t);

	@Generated
	@CFunction
	public static native boolean CATransform3DEqualToTransform(
			@ByValue CATransform3D a, @ByValue CATransform3D b);

	@Generated
	@CFunction
	@ByValue
	public static native CATransform3D CATransform3DMakeTranslation(double tx,
			double ty, double tz);

	@Generated
	@CFunction
	@ByValue
	public static native CATransform3D CATransform3DMakeScale(double sx,
			double sy, double sz);

	@Generated
	@CFunction
	@ByValue
	public static native CATransform3D CATransform3DMakeRotation(double angle,
			double x, double y, double z);

	@Generated
	@CFunction
	@ByValue
	public static native CATransform3D CATransform3DTranslate(
			@ByValue CATransform3D t, double tx, double ty, double tz);

	@Generated
	@CFunction
	@ByValue
	public static native CATransform3D CATransform3DScale(
			@ByValue CATransform3D t, double sx, double sy, double sz);

	@Generated
	@CFunction
	@ByValue
	public static native CATransform3D CATransform3DRotate(
			@ByValue CATransform3D t, double angle, double x, double y, double z);

	@Generated
	@CFunction
	@ByValue
	public static native CATransform3D CATransform3DConcat(
			@ByValue CATransform3D a, @ByValue CATransform3D b);

	@Generated
	@CFunction
	@ByValue
	public static native CATransform3D CATransform3DInvert(
			@ByValue CATransform3D t);

	@Generated
	@CFunction
	@ByValue
	public static native CATransform3D CATransform3DMakeAffineTransform(
			@ByValue CGAffineTransform m);

	@Generated
	@CFunction
	public static native boolean CATransform3DIsAffine(@ByValue CATransform3D t);

	@Generated
	@CFunction
	@ByValue
	public static native CGAffineTransform CATransform3DGetAffineTransform(
			@ByValue CATransform3D t);

	@Generated
	@CVariable()
	public static native int kCIFormatARGB8();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIImageColorSpace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIImageProperties();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIImageAutoAdjustEnhance();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIImageAutoAdjustRedEye();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCIImageAutoAdjustFeatures();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAFillModeForwards();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAFillModeBackwards();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAFillModeBoth();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAFillModeRemoved();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAFillModeFrozen();

	@Generated
	@CVariable()
	@ByValue
	public static native CATransform3D CATransform3DIdentity();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAGravityCenter();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAGravityTop();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAGravityBottom();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAGravityLeft();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAGravityRight();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAGravityTopLeft();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAGravityTopRight();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAGravityBottomLeft();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAGravityBottomRight();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAGravityResize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAGravityResizeAspect();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAGravityResizeAspectFill();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAFilterNearest();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAFilterLinear();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAFilterTrilinear();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAOnOrderIn();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCAOnOrderOut();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String kCATransition();
}
