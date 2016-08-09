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

package mac.appkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.protocol.NSAnimatablePropertyContainer;
import mac.foundation.NSArray;
import mac.foundation.NSDictionary;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSLayoutConstraint extends NSObject implements
		NSAnimatablePropertyContainer {
	static {
		NatJ.register();
	}

	@Generated
	protected NSLayoutConstraint(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSLayoutConstraint alloc();

	@Generated
	@Selector("animationForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object animationForKey(String key);

	@Generated
	@Selector("animations")
	public native NSDictionary animations();

	@Generated
	@Selector("animator")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object animator();

	@Generated
	@Selector("constant")
	public native double constant();

	@Generated
	@Selector("constraintWithItem:attribute:relatedBy:toItem:attribute:multiplier:constant:")
	public static native NSLayoutConstraint constraintWithItemAttributeRelatedByToItemAttributeMultiplierConstant(
			@Mapped(ObjCObjectMapper.class) Object view1, long attr1,
			long relation, @Mapped(ObjCObjectMapper.class) Object view2,
			long attr2, double multiplier, double c);

	@Generated
	@Selector("constraintsWithVisualFormat:options:metrics:views:")
	public static native NSArray constraintsWithVisualFormatOptionsMetricsViews(
			String format, long opts, NSDictionary metrics, NSDictionary views);

	@Generated
	@Selector("defaultAnimationForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultAnimationForKey(String key);

	@Generated
	@ProtocolClassMethod("defaultAnimationForKey")
	@MappedReturn(ObjCObjectMapper.class)
	public Object _defaultAnimationForKey(String key) {
		return defaultAnimationForKey(key);
	}

	@Generated
	@Selector("firstAttribute")
	public native long firstAttribute();

	@Generated
	@Selector("firstItem")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object firstItem();

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("init")
	public native NSLayoutConstraint init();

	@Generated
	@Selector("multiplier")
	public native double multiplier();

	@Generated
	@Selector("priority")
	public native float priority();

	@Generated
	@Selector("relation")
	public native long relation();

	@Generated
	@Selector("secondAttribute")
	public native long secondAttribute();

	@Generated
	@Selector("secondItem")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object secondItem();

	@Generated
	@Selector("setAnimations:")
	public native void setAnimations(NSDictionary animations);

	@Generated
	@Selector("setConstant:")
	public native void setConstant(double value);

	@Generated
	@Selector("setIdentifier:")
	public native void setIdentifier(String value);

	@Generated
	@Selector("setPriority:")
	public native void setPriority(float value);

	@Generated
	@Selector("setShouldBeArchived:")
	public native void setShouldBeArchived(boolean value);

	@Generated
	@Selector("shouldBeArchived")
	public native boolean shouldBeArchived();
}
