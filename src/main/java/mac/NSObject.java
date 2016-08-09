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

package mac;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.*;
import mac.coregraphics.opaque.CGContextRef;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGSize;
import mac.foundation.*;
import mac.quartzcore.CALayer;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSObject extends ObjCObject implements mac.protocol.NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSObject(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URL:resourceDataDidBecomeAvailable:")
	public native void URLResourceDataDidBecomeAvailable(NSURL sender,
			NSData newBytes);

	@Generated
	@Selector("URL:resourceDidFailLoadingWithReason:")
	public native void URLResourceDidFailLoadingWithReason(NSURL sender,
			String reason);

	@Generated
	@Selector("URLResourceDidCancelLoading:")
	public native void URLResourceDidCancelLoading(NSURL sender);

	@Generated
	@Selector("URLResourceDidFinishLoading:")
	public native void URLResourceDidFinishLoading(NSURL sender);

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("addObserver:forKeyPath:options:context:")
	public native void addObserverForKeyPathOptionsContext(NSObject observer,
			String keyPath, long options, VoidPtr context);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSObject alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("attemptRecoveryFromError:optionIndex:")
	public native boolean attemptRecoveryFromErrorOptionIndex(NSError error,
			long recoveryOptionIndex);

	@Generated
	@Selector("attemptRecoveryFromError:optionIndex:delegate:didRecoverSelector:contextInfo:")
	public native void attemptRecoveryFromErrorOptionIndexDelegateDidRecoverSelectorContextInfo(
			NSError error, long recoveryOptionIndex,
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didRecoverSelector, VoidPtr contextInfo);

	@Generated
	@Selector("attributeKeys")
	public native NSArray attributeKeys();

	@Generated
	@Selector("autoContentAccessingProxy")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object autoContentAccessingProxy();

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("autorelease")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object autorelease();

	@Generated
	@Selector("awakeAfterUsingCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object awakeAfterUsingCoder(NSCoder aDecoder);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("class")
	public static native Class class_objc_static();

	@Generated
	@Selector("class")
	public native Class class_objc();

	@Generated
	@Selector("classCode")
	public native int classCode();

	@Generated
	@Selector("classDescription")
	public native NSClassDescription classDescription();

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForArchiver")
	public native Class classForArchiver();

	@Generated
	@Selector("classForCoder")
	public native Class classForCoder();

	@Generated
	@Selector("classForKeyedArchiver")
	public native Class classForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("classForPortCoder")
	public native Class classForPortCoder();

	@Generated
	@Selector("className")
	public native String className();

	@Generated
	@Selector("coerceValue:forKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object coerceValueForKey(
			@Mapped(ObjCObjectMapper.class) Object value, String key);

	@Generated
	@Owned
	@Selector("copy")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copy();

	@Generated
	@Owned
	@Selector("copyScriptingValue:forKey:withProperties:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyScriptingValueForKeyWithProperties(
			@Mapped(ObjCObjectMapper.class) Object value, String key,
			NSDictionary properties);

	@Generated
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object copyWithZone_static(VoidPtr zone);

	@Generated
	@Selector("dealloc")
	public native void dealloc();

	@Generated
	@IsOptional
	@Selector("debugDescription")
	public native String debugDescription();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("description")
	public native String description();

	@Generated
	@Selector("dictionaryWithValuesForKeys:")
	public native NSDictionary dictionaryWithValuesForKeys(NSArray keys);

	@Generated
	@Selector("didChange:valuesAtIndexes:forKey:")
	public native void didChangeValuesAtIndexesForKey(long changeKind,
			NSIndexSet indexes, String key);

	@Generated
	@Selector("didChangeValueForKey:")
	public native void didChangeValueForKey(String key);

	@Generated
	@Selector("didChangeValueForKey:withSetMutation:usingObjects:")
	public native void didChangeValueForKeyWithSetMutationUsingObjects(
			String key, long mutationKind, NSSet objects);

	@Generated
	@Selector("doesContain:")
	public native boolean doesContain(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("doesNotRecognizeSelector:")
	public native void doesNotRecognizeSelector(SEL aSelector);

	@Generated
	@Selector("fileManager:shouldProceedAfterError:")
	public native boolean fileManagerShouldProceedAfterError(NSFileManager fm,
			NSDictionary errorInfo);

	@Generated
	@Selector("fileManager:willProcessPath:")
	public native void fileManagerWillProcessPath(NSFileManager fm, String path);

	@Generated
	@Selector("finalize")
	public native void finalize_objc();

	@Generated
	@Selector("forwardInvocation:")
	public native void forwardInvocation(NSInvocation anInvocation);

	@Generated
	@Selector("forwardingTargetForSelector:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object forwardingTargetForSelector(SEL aSelector);

	@Generated
	@Selector("handleQueryWithUnboundKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object handleQueryWithUnboundKey(String key);

	@Generated
	@Selector("handleTakeValue:forUnboundKey:")
	public native void handleTakeValueForUnboundKey(
			@Mapped(ObjCObjectMapper.class) Object value, String key);

	@Generated
	@Selector("hash")
	public native long hash();

	@Generated
	@Selector("indicesOfObjectsByEvaluatingObjectSpecifier:")
	public native NSArray indicesOfObjectsByEvaluatingObjectSpecifier(
			NSScriptObjectSpecifier specifier);

	@Generated
	@Selector("init")
	public native NSObject init();

	@Generated
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("insertValue:atIndex:inPropertyWithKey:")
	public native void insertValueAtIndexInPropertyWithKey(
			@Mapped(ObjCObjectMapper.class) Object value, long index, String key);

	@Generated
	@Selector("insertValue:inPropertyWithKey:")
	public native void insertValueInPropertyWithKey(
			@Mapped(ObjCObjectMapper.class) Object value, String key);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("inverseForRelationshipKey:")
	public native String inverseForRelationshipKey(String relationshipKey);

	@Generated
	@Selector("isCaseInsensitiveLike:")
	public native boolean isCaseInsensitiveLike(String object);

	@Generated
	@Selector("isEqual:")
	public native boolean isEqual(@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("isEqualTo:")
	public native boolean isEqualTo(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("isGreaterThan:")
	public native boolean isGreaterThan(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("isGreaterThanOrEqualTo:")
	public native boolean isGreaterThanOrEqualTo(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("isKindOfClass:")
	public native boolean isKindOfClass(Class aClass);

	@Generated
	@Selector("isLessThan:")
	public native boolean isLessThan(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("isLessThanOrEqualTo:")
	public native boolean isLessThanOrEqualTo(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("isLike:")
	public native boolean isLike(String object);

	@Generated
	@Selector("isMemberOfClass:")
	public native boolean isMemberOfClass(Class aClass);

	@Generated
	@Selector("isNotEqualTo:")
	public native boolean isNotEqualTo(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("isProxy")
	public native boolean isProxy();

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet keyPathsForValuesAffectingValueForKey(String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Selector("methodSignatureForSelector:")
	public native NSMethodSignature methodSignatureForSelector(SEL aSelector);

	@Generated
	@Selector("mutableArrayValueForKey:")
	public native NSMutableArray mutableArrayValueForKey(String key);

	@Generated
	@Selector("mutableArrayValueForKeyPath:")
	public native NSMutableArray mutableArrayValueForKeyPath(String keyPath);

	@Generated
	@Selector("mutableCopy")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mutableCopy();

	@Generated
	@Selector("mutableCopyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object mutableCopyWithZone_static(VoidPtr zone);

	@Generated
	@Selector("mutableOrderedSetValueForKey:")
	public native NSMutableOrderedSet mutableOrderedSetValueForKey(String key);

	@Generated
	@Selector("mutableOrderedSetValueForKeyPath:")
	public native NSMutableOrderedSet mutableOrderedSetValueForKeyPath(
			String keyPath);

	@Generated
	@Selector("mutableSetValueForKey:")
	public native NSMutableSet mutableSetValueForKey(String key);

	@Generated
	@Selector("mutableSetValueForKeyPath:")
	public native NSMutableSet mutableSetValueForKeyPath(String keyPath);

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("newScriptingObjectOfClass:forValueForKey:withContentsValue:properties:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object newScriptingObjectOfClassForValueForKeyWithContentsValueProperties(
			Class objectClass, String key,
			@Mapped(ObjCObjectMapper.class) Object contentsValue,
			NSDictionary properties);

	@Generated
	@Selector("objectSpecifier")
	public native NSScriptObjectSpecifier objectSpecifier();

	@Generated
	@Selector("observationInfo")
	public native VoidPtr observationInfo();

	@Generated
	@Selector("observeValueForKeyPath:ofObject:change:context:")
	public native void observeValueForKeyPathOfObjectChangeContext(
			String keyPath, @Mapped(ObjCObjectMapper.class) Object object,
			NSDictionary change, VoidPtr context);

	@Generated
	@Selector("performSelector:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object performSelector(SEL aSelector);

	@Generated
	@Selector("performSelector:onThread:withObject:waitUntilDone:")
	public native void performSelectorOnThreadWithObjectWaitUntilDone(
			SEL aSelector, NSThread thr,
			@Mapped(ObjCObjectMapper.class) Object arg, boolean wait_);

	@Generated
	@Selector("performSelector:onThread:withObject:waitUntilDone:modes:")
	public native void performSelectorOnThreadWithObjectWaitUntilDoneModes(
			SEL aSelector, NSThread thr,
			@Mapped(ObjCObjectMapper.class) Object arg, boolean wait_,
			NSArray array);

	@Generated
	@Selector("performSelector:withObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object performSelectorWithObject(SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("performSelector:withObject:afterDelay:")
	public native void performSelectorWithObjectAfterDelay(SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument, double delay);

	@Generated
	@Selector("performSelector:withObject:afterDelay:inModes:")
	public native void performSelectorWithObjectAfterDelayInModes(
			SEL aSelector, @Mapped(ObjCObjectMapper.class) Object anArgument,
			double delay, NSArray modes);

	@Generated
	@Selector("performSelector:withObject:withObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object performSelectorWithObjectWithObject(SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object object1,
			@Mapped(ObjCObjectMapper.class) Object object2);

	@Generated
	@Selector("performSelectorInBackground:withObject:")
	public native void performSelectorInBackgroundWithObject(SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object arg);

	@Generated
	@Selector("performSelectorOnMainThread:withObject:waitUntilDone:")
	public native void performSelectorOnMainThreadWithObjectWaitUntilDone(
			SEL aSelector, @Mapped(ObjCObjectMapper.class) Object arg,
			boolean wait_);

	@Generated
	@Selector("performSelectorOnMainThread:withObject:waitUntilDone:modes:")
	public native void performSelectorOnMainThreadWithObjectWaitUntilDoneModes(
			SEL aSelector, @Mapped(ObjCObjectMapper.class) Object arg,
			boolean wait_, NSArray array);

	@Generated
	@Selector("release")
	public native void release();

	@Generated
	@Selector("removeObserver:forKeyPath:")
	public native void removeObserverForKeyPath(NSObject observer,
			String keyPath);

	@Generated
	@Selector("removeObserver:forKeyPath:context:")
	public native void removeObserverForKeyPathContext(NSObject observer,
			String keyPath, VoidPtr context);

	@Generated
	@Selector("removeValueAtIndex:fromPropertyWithKey:")
	public native void removeValueAtIndexFromPropertyWithKey(long index,
			String key);

	@Generated
	@Selector("replaceValueAtIndex:inPropertyWithKey:withValue:")
	public native void replaceValueAtIndexInPropertyWithKeyWithValue(
			long index, String key, @Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("replacementObjectForArchiver:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object replacementObjectForArchiver(NSArchiver archiver);

	@Generated
	@Selector("replacementObjectForCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object replacementObjectForCoder(NSCoder aCoder);

	@Generated
	@Selector("replacementObjectForKeyedArchiver:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object replacementObjectForKeyedArchiver(
			NSKeyedArchiver archiver);

	@Generated
	@Selector("replacementObjectForPortCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object replacementObjectForPortCoder(NSPortCoder coder);

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("respondsToSelector:")
	public native boolean respondsToSelector(SEL aSelector);

	@Generated
	@Selector("retain")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object retain();

	@Generated
	@Selector("retainCount")
	public native long retainCount();

	@Generated
	@Selector("scriptingBeginsWith:")
	public native boolean scriptingBeginsWith(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("scriptingContains:")
	public native boolean scriptingContains(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("scriptingEndsWith:")
	public native boolean scriptingEndsWith(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("scriptingIsEqualTo:")
	public native boolean scriptingIsEqualTo(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("scriptingIsGreaterThan:")
	public native boolean scriptingIsGreaterThan(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("scriptingIsGreaterThanOrEqualTo:")
	public native boolean scriptingIsGreaterThanOrEqualTo(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("scriptingIsLessThan:")
	public native boolean scriptingIsLessThan(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("scriptingIsLessThanOrEqualTo:")
	public native boolean scriptingIsLessThanOrEqualTo(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("scriptingProperties")
	public native NSDictionary scriptingProperties();

	@Generated
	@Selector("scriptingValueForSpecifier:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object scriptingValueForSpecifier(
			NSScriptObjectSpecifier objectSpecifier);

	@Generated
	@Selector("self")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object self();

	@Generated
	@Selector("setKeys:triggerChangeNotificationsForDependentKey:")
	public static native void setKeysTriggerChangeNotificationsForDependentKey(
			NSArray keys, String dependentKey);

	@Generated
	@Selector("setNilValueForKey:")
	public native void setNilValueForKey(String key);

	@Generated
	@Selector("setObservationInfo:")
	public native void setObservationInfo(VoidPtr observationInfo);

	@Generated
	@Selector("setScriptingProperties:")
	public native void setScriptingProperties(NSDictionary properties);

	@Generated
	@Selector("setValue:forKey:")
	public native void setValueForKey(
			@Mapped(ObjCObjectMapper.class) Object value, String key);

	@Generated
	@Selector("setValue:forKeyPath:")
	public native void setValueForKeyPath(
			@Mapped(ObjCObjectMapper.class) Object value, String keyPath);

	@Generated
	@Selector("setValue:forUndefinedKey:")
	public native void setValueForUndefinedKey(
			@Mapped(ObjCObjectMapper.class) Object value, String key);

	@Generated
	@Selector("setValuesForKeysWithDictionary:")
	public native void setValuesForKeysWithDictionary(NSDictionary keyedValues);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion_static(long aVersion);

	@Generated
	@Selector("storedValueForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object storedValueForKey(String key);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("superclass")
	public native Class superclass();

	@Generated
	@Selector("takeStoredValue:forKey:")
	public native void takeStoredValueForKey(
			@Mapped(ObjCObjectMapper.class) Object value, String key);

	@Generated
	@Selector("takeValue:forKey:")
	public native void takeValueForKey(
			@Mapped(ObjCObjectMapper.class) Object value, String key);

	@Generated
	@Selector("takeValue:forKeyPath:")
	public native void takeValueForKeyPath(
			@Mapped(ObjCObjectMapper.class) Object value, String keyPath);

	@Generated
	@Selector("takeValuesFromDictionary:")
	public native void takeValuesFromDictionary(NSDictionary properties);

	@Generated
	@Selector("toManyRelationshipKeys")
	public native NSArray toManyRelationshipKeys();

	@Generated
	@Selector("toOneRelationshipKeys")
	public native NSArray toOneRelationshipKeys();

	@Generated
	@Selector("unableToSetNilForKey:")
	public native void unableToSetNilForKey(String key);

	@Generated
	@Selector("useStoredAccessor")
	public static native boolean useStoredAccessor();

	@Generated
	@Selector("validateValue:forKey:error:")
	public native boolean validateValueForKeyError(Ptr<? extends ObjCObject> ioValue,
			String inKey, Ptr<NSError> outError);

	@Generated
	@Selector("validateValue:forKeyPath:error:")
	public native boolean validateValueForKeyPathError(Ptr<? extends ObjCObject> ioValue,
			String inKeyPath, Ptr<NSError> outError);

	@Generated
	@Selector("valueAtIndex:inPropertyWithKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueAtIndexInPropertyWithKey(long index, String key);

	@Generated
	@Selector("valueForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueForKey(String key);

	@Generated
	@Selector("valueForKeyPath:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueForKeyPath(String keyPath);

	@Generated
	@Selector("valueForUndefinedKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueForUndefinedKey(String key);

	@Generated
	@Selector("valueWithName:inPropertyWithKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueWithNameInPropertyWithKey(String name, String key);

	@Generated
	@Selector("valueWithUniqueID:inPropertyWithKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueWithUniqueIDInPropertyWithKey(
			@Mapped(ObjCObjectMapper.class) Object uniqueID, String key);

	@Generated
	@Selector("valuesForKeys:")
	public native NSDictionary valuesForKeys(NSArray keys);

	@Generated
	@Selector("version")
	public static native long version_static();

	@Generated
	@Selector("willChange:valuesAtIndexes:forKey:")
	public native void willChangeValuesAtIndexesForKey(long changeKind,
			NSIndexSet indexes, String key);

	@Generated
	@Selector("willChangeValueForKey:")
	public native void willChangeValueForKey(String key);

	@Generated
	@Selector("willChangeValueForKey:withSetMutation:usingObjects:")
	public native void willChangeValueForKeyWithSetMutationUsingObjects(
			String key, long mutationKind, NSSet objects);

	@Generated
	@Selector("zone")
	public native VoidPtr zone();

	@Generated
	@Selector("accessibilityActionDescription:")
	public native String accessibilityActionDescription(String action);

	@Generated
	@Selector("accessibilityActionNames")
	public native NSArray accessibilityActionNames();

	@Generated
	@Selector("accessibilityArrayAttributeCount:")
	public native long accessibilityArrayAttributeCount(String attribute);

	@Generated
	@Selector("accessibilityArrayAttributeValues:index:maxCount:")
	public native NSArray accessibilityArrayAttributeValuesIndexMaxCount(
			String attribute, long index, long maxCount);

	@Generated
	@Selector("accessibilityAttributeNames")
	public native NSArray accessibilityAttributeNames();

	@Generated
	@Selector("accessibilityAttributeValue:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object accessibilityAttributeValue(String attribute);

	@Generated
	@Selector("accessibilityAttributeValue:forParameter:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object accessibilityAttributeValueForParameter(
			String attribute, @Mapped(ObjCObjectMapper.class) Object parameter);

	@Generated
	@Selector("accessibilityFocusedUIElement")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object accessibilityFocusedUIElement();

	@Generated
	@Selector("accessibilityHitTest:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object accessibilityHitTest(@ByValue CGPoint point);

	@Generated
	@Selector("accessibilityIndexOfChild:")
	public native long accessibilityIndexOfChild(
			@Mapped(ObjCObjectMapper.class) Object child);

	@Generated
	@Selector("accessibilityIsAttributeSettable:")
	public native boolean accessibilityIsAttributeSettable(String attribute);

	@Generated
	@Selector("accessibilityIsIgnored")
	public native boolean accessibilityIsIgnored();

	@Generated
	@Selector("accessibilityNotifiesWhenDestroyed")
	public native boolean accessibilityNotifiesWhenDestroyed();

	@Generated
	@Selector("accessibilityParameterizedAttributeNames")
	public native NSArray accessibilityParameterizedAttributeNames();

	@Generated
	@Selector("accessibilityPerformAction:")
	public native void accessibilityPerformAction(String action);

	@Generated
	@Selector("accessibilitySetOverrideValue:forAttribute:")
	public native boolean accessibilitySetOverrideValueForAttribute(
			@Mapped(ObjCObjectMapper.class) Object value, String attribute);

	@Generated
	@Selector("accessibilitySetValue:forAttribute:")
	public native void accessibilitySetValueForAttribute(
			@Mapped(ObjCObjectMapper.class) Object value, String attribute);

	@Generated
	@Selector("actionForLayer:forKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object actionForLayerForKey(CALayer layer, String event);

	@Generated
	@Selector("application:delegateHandlesKey:")
	public native boolean applicationDelegateHandlesKey(NSApplication sender,
			String key);

	@Generated
	@Selector("awakeFromNib")
	public native void awakeFromNib();

	@Generated
	@Selector("bind:toObject:withKeyPath:options:")
	public native void bindToObjectWithKeyPathOptions(String binding,
			@Mapped(ObjCObjectMapper.class) Object observable, String keyPath,
			NSDictionary options);

	@Generated
	@Selector("changeColor:")
	public native void changeColor(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("changeFont:")
	public native void changeFont(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("commitEditing")
	public native boolean commitEditing();

	@Generated
	@Selector("commitEditingAndReturnError:")
	public native boolean commitEditingAndReturnError(Ptr<NSError> error);

	@Generated
	@Selector("commitEditingWithDelegate:didCommitSelector:contextInfo:")
	public native void commitEditingWithDelegateDidCommitSelectorContextInfo(
			@Mapped(ObjCObjectMapper.class) Object delegate,
			SEL didCommitSelector, VoidPtr contextInfo);

	@Generated
	@Selector("controlTextDidBeginEditing:")
	public native void controlTextDidBeginEditing(NSNotification obj);

	@Generated
	@Selector("controlTextDidChange:")
	public native void controlTextDidChange(NSNotification obj);

	@Generated
	@Selector("controlTextDidEndEditing:")
	public native void controlTextDidEndEditing(NSNotification obj);

	@Generated
	@Selector("defaultPlaceholderForMarker:withBinding:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultPlaceholderForMarkerWithBinding(
			@Mapped(ObjCObjectMapper.class) Object marker, String binding);

	@Generated
	@Selector("discardEditing")
	public native void discardEditing();

	@Generated
	@Selector("displayLayer:")
	public native void displayLayer(CALayer layer);

	@Generated
	@Selector("draggedImage:beganAt:")
	public native void draggedImageBeganAt(NSImage image,
			@ByValue CGPoint screenPoint);

	@Generated
	@Selector("draggedImage:endedAt:operation:")
	public native void draggedImageEndedAtOperation(NSImage image,
			@ByValue CGPoint screenPoint, long operation);

	@Generated
	@Selector("draggedImage:movedTo:")
	public native void draggedImageMovedTo(NSImage image,
			@ByValue CGPoint screenPoint);

	@Generated
	@Selector("draggingSourceOperationMaskForLocal:")
	public native long draggingSourceOperationMaskForLocal(boolean flag);

	@Generated
	@Selector("drawLayer:inContext:")
	public native void drawLayerInContext(CALayer layer, CGContextRef ctx);

	@Generated
	@Selector("exposeBinding:")
	public static native void exposeBinding(String binding);

	@Generated
	@Selector("exposedBindings")
	public native NSArray exposedBindings();

	@Generated
	@Selector("fontManager:willIncludeFont:")
	public native boolean fontManagerWillIncludeFont(
			@Mapped(ObjCObjectMapper.class) Object sender, String fontName);

	@Generated
	@Selector("ignoreModifierKeysWhileDragging")
	public native boolean ignoreModifierKeysWhileDragging();

	@Generated
	@Selector("infoForBinding:")
	public native NSDictionary infoForBinding(String binding);

	@Generated
	@Selector("invalidateLayoutOfLayer:")
	public native void invalidateLayoutOfLayer(CALayer layer);

	@Generated
	@Selector("isExplicitlyIncluded")
	public native boolean isExplicitlyIncluded();

	@Generated
	@Selector("key")
	public native String key();

	@Generated
	@Selector("layer:shouldInheritContentsScale:fromWindow:")
	public native boolean layerShouldInheritContentsScaleFromWindow(
			CALayer layer, double newScale, NSWindow window);

	@Generated
	@Selector("layoutSublayersOfLayer:")
	public native void layoutSublayersOfLayer(CALayer layer);

	@Generated
	@Selector("localizedKey")
	public native String localizedKey();

	@Generated
	@Selector("namesOfPromisedFilesDroppedAtDestination:")
	public native NSArray namesOfPromisedFilesDroppedAtDestination(
			NSURL dropDestination);

	@Generated
	@Selector("objectDidBeginEditing:")
	public native void objectDidBeginEditing(
			@Mapped(ObjCObjectMapper.class) Object editor);

	@Generated
	@Selector("objectDidEndEditing:")
	public native void objectDidEndEditing(
			@Mapped(ObjCObjectMapper.class) Object editor);

	@Generated
	@Selector("optionDescriptionsForBinding:")
	public native NSArray optionDescriptionsForBinding(String aBinding);

	@Generated
	@Selector("panel:compareFilename:with:caseSensitive:")
	public native long panelCompareFilenameWithCaseSensitive(
			@Mapped(ObjCObjectMapper.class) Object sender, String name1,
			String name2, boolean caseSensitive);

	@Generated
	@Selector("panel:directoryDidChange:")
	public native void panelDirectoryDidChange(
			@Mapped(ObjCObjectMapper.class) Object sender, String path);

	@Generated
	@Selector("panel:isValidFilename:")
	public native boolean panelIsValidFilename(
			@Mapped(ObjCObjectMapper.class) Object sender, String filename);

	@Generated
	@Selector("panel:shouldShowFilename:")
	public native boolean panelShouldShowFilename(
			@Mapped(ObjCObjectMapper.class) Object sender, String filename);

	@Generated
	@Selector("pasteboard:provideDataForType:")
	public native void pasteboardProvideDataForType(NSPasteboard sender,
			String type);

	@Generated
	@Selector("pasteboardChangedOwner:")
	public native void pasteboardChangedOwner(NSPasteboard sender);

	@Generated
	@Selector("preferredSizeOfLayer:")
	@ByValue
	public native CGSize preferredSizeOfLayer(CALayer layer);

	@Generated
	@Selector("setDefaultPlaceholder:forMarker:withBinding:")
	public static native void setDefaultPlaceholderForMarkerWithBinding(
			@Mapped(ObjCObjectMapper.class) Object placeholder,
			@Mapped(ObjCObjectMapper.class) Object marker, String binding);

	@Generated
	@Selector("setKey:")
	public native void setKey(String key);

	@Generated
	@Selector("setLocalizedKey:")
	public native void setLocalizedKey(String localizedKey);

	@Generated
	@Selector("setValue:")
	public native void setValue(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("tableView:writeRows:toPasteboard:")
	public native boolean tableViewWriteRowsToPasteboard(NSTableView tableView,
			NSArray rows, NSPasteboard pboard);

	@Generated
	@Selector("unbind:")
	public native void unbind(String binding);

	@Generated
	@Selector("validModesForFontPanel:")
	public native long validModesForFontPanel(NSFontPanel fontPanel);

	@Generated
	@Selector("validateMenuItem:")
	public native boolean validateMenuItem(NSMenuItem menuItem);

	@Generated
	@Selector("validateToolbarItem:")
	public native boolean validateToolbarItem(NSToolbarItem theItem);

	@Generated
	@Selector("value")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object value();

	@Generated
	@Selector("valueClassForBinding:")
	public native Class valueClassForBinding(String binding);

	@Generated
	@Selector("view:stringForToolTip:point:userData:")
	public native String viewStringForToolTipPointUserData(NSView view,
			long tag, @ByValue CGPoint point, VoidPtr data);
}
