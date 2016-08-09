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

package mac.foundation.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.map.ObjCStringMapper;
import mac.NSObject;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.*;
import mac.foundation.struct.*;

@Generated
@Library("Foundation")
@Runtime(CRuntime.class)
public final class Foundation {
	static {
		NatJ.register();
	}

	@Generated
	private Foundation() {
	}

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromSelector(SEL aSelector);

	@Generated
	@CFunction
	public static native SEL NSSelectorFromString(
			@Mapped(ObjCStringMapper.class) String aSelectorName);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromClass(Class aClass);

	@Generated
	@CFunction
	public static native Class NSClassFromString(
			@Mapped(ObjCStringMapper.class) String aClassName);

	@Generated
	@CFunction
	@UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
	public static native String NSGetSizeAndAlignment(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String typePtr,
			LongPtr sizep, LongPtr alignp);

	@Generated
	@CFunction
	public static native VoidPtr NSDefaultMallocZone();

	@Generated
	@CFunction
	public static native VoidPtr NSCreateZone(long startSize, long granularity,
			boolean canFree);

	@Generated
	@CFunction
	public static native void NSRecycleZone(VoidPtr zone);

	@Generated
	@CFunction
	public static native void NSSetZoneName(VoidPtr zone,
			@Mapped(ObjCStringMapper.class) String name);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSZoneName(VoidPtr zone);

	@Generated
	@CFunction
	public static native VoidPtr NSZoneFromPointer(VoidPtr ptr);

	@Generated
	@CFunction
	public static native VoidPtr NSZoneMalloc(VoidPtr zone, long size);

	@Generated
	@CFunction
	public static native VoidPtr NSZoneCalloc(VoidPtr zone, long numElems,
			long byteSize);

	@Generated
	@CFunction
	public static native VoidPtr NSZoneRealloc(VoidPtr zone, VoidPtr ptr,
			long size);

	@Generated
	@CFunction
	public static native void NSZoneFree(VoidPtr zone, VoidPtr ptr);

	@Generated
	@CFunction
	public static native VoidPtr NSAllocateCollectable(long size, long options);

	@Generated
	@CFunction
	public static native VoidPtr NSReallocateCollectable(VoidPtr ptr,
			long size, long options);

	@Generated
	@Inline
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object NSMakeCollectable(ConstVoidPtr cf);

	@Generated
	@CFunction
	public static native long NSPageSize();

	@Generated
	@CFunction
	public static native long NSLogPageSize();

	@Generated
	@CFunction
	public static native long NSRoundUpToMultipleOfPageSize(long bytes);

	@Generated
	@CFunction
	public static native long NSRoundDownToMultipleOfPageSize(long bytes);

	@Generated
	@CFunction
	public static native VoidPtr NSAllocateMemoryPages(long bytes);

	@Generated
	@CFunction
	public static native void NSDeallocateMemoryPages(VoidPtr ptr, long bytes);

	@Generated
	@CFunction
	public static native void NSCopyMemoryPages(ConstVoidPtr source,
			VoidPtr dest, long bytes);

	@Generated
	@CFunction
	public static native long NSRealMemoryAvailable();

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object NSAllocateObject(Class aClass, long extraBytes,
			VoidPtr zone);

	@Generated
	@CFunction
	public static native void NSDeallocateObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object NSCopyObject(
			@Mapped(ObjCObjectMapper.class) Object object, long extraBytes,
			VoidPtr zone);

	@Generated
	@CFunction
	public static native boolean NSShouldRetainWithZone(
			@Mapped(ObjCObjectMapper.class) Object anObject,
			VoidPtr requestedZone);

	@Generated
	@CFunction
	public static native void NSIncrementExtraRefCount(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	public static native boolean NSDecrementExtraRefCountWasZero(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@CFunction
	public static native long NSExtraRefCount(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Inline
	@CFunction
	public static native ConstVoidPtr CFBridgingRetain(
			@Mapped(ObjCObjectMapper.class) Object X);

	@Generated
	@Inline
	@CFunction
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object CFBridgingRelease(ConstVoidPtr X);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native NSRange NSMakeRange(long loc, long len);

	@Generated
	@Inline
	@CFunction
	public static native long NSMaxRange(@ByValue NSRange range);

	@Generated
	@Inline
	@CFunction
	public static native boolean NSLocationInRange(long loc,
			@ByValue NSRange range);

	@Generated
	@Inline
	@CFunction
	public static native boolean NSEqualRanges(@ByValue NSRange range1,
			@ByValue NSRange range2);

	@Generated
	@CFunction
	@ByValue
	public static native NSRange NSUnionRange(@ByValue NSRange range1,
			@ByValue NSRange range2);

	@Generated
	@CFunction
	@ByValue
	public static native NSRange NSIntersectionRange(@ByValue NSRange range1,
			@ByValue NSRange range2);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromRange(@ByValue NSRange range);

	@Generated
	@CFunction
	@ByValue
	public static native NSRange NSRangeFromString(
			@Mapped(ObjCStringMapper.class) String aString);

	@Generated
	@Inline
	@CFunction
	public static native long NSHostByteOrder();

	@Generated
	@Inline
	@CFunction
	public static native short NSSwapShort(short inv);

	@Generated
	@Inline
	@CFunction
	public static native int NSSwapInt(int inv);

	@Generated
	@Inline
	@CFunction
	public static native long NSSwapLong(long inv);

	@Generated
	@Inline
	@CFunction
	public static native long NSSwapLongLong(long inv);

	@Generated
	@Inline
	@CFunction
	public static native short NSSwapBigShortToHost(short x);

	@Generated
	@Inline
	@CFunction
	public static native int NSSwapBigIntToHost(int x);

	@Generated
	@Inline
	@CFunction
	public static native long NSSwapBigLongToHost(long x);

	@Generated
	@Inline
	@CFunction
	public static native long NSSwapBigLongLongToHost(long x);

	@Generated
	@Inline
	@CFunction
	public static native short NSSwapHostShortToBig(short x);

	@Generated
	@Inline
	@CFunction
	public static native int NSSwapHostIntToBig(int x);

	@Generated
	@Inline
	@CFunction
	public static native long NSSwapHostLongToBig(long x);

	@Generated
	@Inline
	@CFunction
	public static native long NSSwapHostLongLongToBig(long x);

	@Generated
	@Inline
	@CFunction
	public static native short NSSwapLittleShortToHost(short x);

	@Generated
	@Inline
	@CFunction
	public static native int NSSwapLittleIntToHost(int x);

	@Generated
	@Inline
	@CFunction
	public static native long NSSwapLittleLongToHost(long x);

	@Generated
	@Inline
	@CFunction
	public static native long NSSwapLittleLongLongToHost(long x);

	@Generated
	@Inline
	@CFunction
	public static native short NSSwapHostShortToLittle(short x);

	@Generated
	@Inline
	@CFunction
	public static native int NSSwapHostIntToLittle(int x);

	@Generated
	@Inline
	@CFunction
	public static native long NSSwapHostLongToLittle(long x);

	@Generated
	@Inline
	@CFunction
	public static native long NSSwapHostLongLongToLittle(long x);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native NSSwappedFloat NSConvertHostFloatToSwapped(float x);

	@Generated
	@Inline
	@CFunction
	public static native float NSConvertSwappedFloatToHost(
			@ByValue NSSwappedFloat x);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native NSSwappedDouble NSConvertHostDoubleToSwapped(double x);

	@Generated
	@Inline
	@CFunction
	public static native double NSConvertSwappedDoubleToHost(
			@ByValue NSSwappedDouble x);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native NSSwappedFloat NSSwapFloat(@ByValue NSSwappedFloat x);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native NSSwappedDouble NSSwapDouble(@ByValue NSSwappedDouble x);

	@Generated
	@Inline
	@CFunction
	public static native double NSSwapBigDoubleToHost(@ByValue NSSwappedDouble x);

	@Generated
	@Inline
	@CFunction
	public static native float NSSwapBigFloatToHost(@ByValue NSSwappedFloat x);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native NSSwappedDouble NSSwapHostDoubleToBig(double x);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native NSSwappedFloat NSSwapHostFloatToBig(float x);

	@Generated
	@Inline
	@CFunction
	public static native double NSSwapLittleDoubleToHost(
			@ByValue NSSwappedDouble x);

	@Generated
	@Inline
	@CFunction
	public static native float NSSwapLittleFloatToHost(@ByValue NSSwappedFloat x);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native NSSwappedDouble NSSwapHostDoubleToLittle(double x);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native NSSwappedFloat NSSwapHostFloatToLittle(float x);

	@Generated
	@CFunction
	public static native NSObject NXReadNSObjectFromCoder(NSCoder decoder);

	@Generated
	@Inline
	@CFunction
	public static native boolean NSDecimalIsNotANumber(VoidPtr dcm);

	@Generated
	@CFunction
	public static native void NSDecimalCopy(VoidPtr destination, VoidPtr source);

	@Generated
	@CFunction
	public static native void NSDecimalCompact(VoidPtr number);

	@Generated
	@CFunction
	public static native long NSDecimalCompare(VoidPtr leftOperand,
			VoidPtr rightOperand);

	@Generated
	@CFunction
	public static native void NSDecimalRound(VoidPtr result, VoidPtr number,
			long scale, long roundingMode);

	@Generated
	@CFunction
	public static native long NSDecimalNormalize(VoidPtr number1,
			VoidPtr number2, long roundingMode);

	@Generated
	@CFunction
	public static native long NSDecimalAdd(VoidPtr result, VoidPtr leftOperand,
			VoidPtr rightOperand, long roundingMode);

	@Generated
	@CFunction
	public static native long NSDecimalSubtract(VoidPtr result,
			VoidPtr leftOperand, VoidPtr rightOperand, long roundingMode);

	@Generated
	@CFunction
	public static native long NSDecimalMultiply(VoidPtr result,
			VoidPtr leftOperand, VoidPtr rightOperand, long roundingMode);

	@Generated
	@CFunction
	public static native long NSDecimalDivide(VoidPtr result,
			VoidPtr leftOperand, VoidPtr rightOperand, long roundingMode);

	@Generated
	@CFunction
	public static native long NSDecimalPower(VoidPtr result, VoidPtr number,
			long power, long roundingMode);

	@Generated
	@CFunction
	public static native long NSDecimalMultiplyByPowerOf10(VoidPtr result,
			VoidPtr number, short power, long roundingMode);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDecimalString(VoidPtr dcm,
			@Mapped(ObjCObjectMapper.class) Object locale);

	@Generated
	@CFunction
	public static native void NSSetUncaughtExceptionHandler(
			@FunctionPtr(name = "call_NSSetUncaughtExceptionHandler") Function_NSSetUncaughtExceptionHandler arg1);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_NSSetUncaughtExceptionHandler {
		@Generated
		public void call_NSSetUncaughtExceptionHandler(NSException arg0);
	}

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUserName();

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFullUserName();

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHomeDirectory();

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHomeDirectoryForUser(
			@Mapped(ObjCStringMapper.class) String userName);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTemporaryDirectory();

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOpenStepRootDirectory();

	@Generated
	@CFunction
	public static native NSArray NSSearchPathForDirectoriesInDomains(
			long directory, long domainMask, boolean expandTilde);

	@Generated
	@CFunction
	public static native void NSFreeHashTable(NSHashTable table);

	@Generated
	@CFunction
	public static native void NSResetHashTable(NSHashTable table);

	@Generated
	@CFunction
	public static native boolean NSCompareHashTables(NSHashTable table1,
			NSHashTable table2);

	@Generated
	@CFunction
	public static native NSHashTable NSCopyHashTableWithZone(NSHashTable table,
			VoidPtr zone);

	@Generated
	@CFunction
	public static native VoidPtr NSHashGet(NSHashTable table,
			ConstVoidPtr pointer);

	@Generated
	@CFunction
	public static native void NSHashInsert(NSHashTable table,
			ConstVoidPtr pointer);

	@Generated
	@CFunction
	public static native void NSHashInsertKnownAbsent(NSHashTable table,
			ConstVoidPtr pointer);

	@Generated
	@CFunction
	public static native VoidPtr NSHashInsertIfAbsent(NSHashTable table,
			ConstVoidPtr pointer);

	@Generated
	@CFunction
	public static native void NSHashRemove(NSHashTable table,
			ConstVoidPtr pointer);

	@Generated
	@CFunction
	@ByValue
	public static native NSHashEnumerator NSEnumerateHashTable(NSHashTable table);

	@Generated
	@CFunction
	public static native VoidPtr NSNextHashEnumeratorItem(
			@UncertainArgument("Options: reference, array Fallback: reference") NSHashEnumerator enumerator);

	@Generated
	@CFunction
	public static native void NSEndHashTableEnumeration(
			@UncertainArgument("Options: reference, array Fallback: reference") NSHashEnumerator enumerator);

	@Generated
	@CFunction
	public static native long NSCountHashTable(NSHashTable table);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromHashTable(NSHashTable table);

	@Generated
	@CFunction
	public static native NSArray NSAllHashTableObjects(NSHashTable table);

	@Generated
	@CFunction
	public static native NSHashTable NSCreateHashTableWithZone(
			@ByValue NSHashTableCallBacks callBacks, long capacity, VoidPtr zone);

	@Generated
	@CFunction
	public static native NSHashTable NSCreateHashTable(
			@ByValue NSHashTableCallBacks callBacks, long capacity);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGPoint NSMakePoint(double x, double y);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGSize NSMakeSize(double w, double h);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGRect NSMakeRect(double x, double y, double w,
			double h);

	@Generated
	@Inline
	@CFunction
	public static native double NSMaxX(@ByValue CGRect aRect);

	@Generated
	@Inline
	@CFunction
	public static native double NSMaxY(@ByValue CGRect aRect);

	@Generated
	@Inline
	@CFunction
	public static native double NSMidX(@ByValue CGRect aRect);

	@Generated
	@Inline
	@CFunction
	public static native double NSMidY(@ByValue CGRect aRect);

	@Generated
	@Inline
	@CFunction
	public static native double NSMinX(@ByValue CGRect aRect);

	@Generated
	@Inline
	@CFunction
	public static native double NSMinY(@ByValue CGRect aRect);

	@Generated
	@Inline
	@CFunction
	public static native double NSWidth(@ByValue CGRect aRect);

	@Generated
	@Inline
	@CFunction
	public static native double NSHeight(@ByValue CGRect aRect);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGRect NSRectFromCGRect(@ByValue CGRect cgrect);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGRect NSRectToCGRect(@ByValue CGRect nsrect);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGPoint NSPointFromCGPoint(@ByValue CGPoint cgpoint);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGPoint NSPointToCGPoint(@ByValue CGPoint nspoint);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGSize NSSizeFromCGSize(@ByValue CGSize cgsize);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native CGSize NSSizeToCGSize(@ByValue CGSize nssize);

	@Generated
	@CFunction
	public static native boolean NSEqualPoints(@ByValue CGPoint aPoint,
			@ByValue CGPoint bPoint);

	@Generated
	@CFunction
	public static native boolean NSEqualSizes(@ByValue CGSize aSize,
			@ByValue CGSize bSize);

	@Generated
	@CFunction
	public static native boolean NSEqualRects(@ByValue CGRect aRect,
			@ByValue CGRect bRect);

	@Generated
	@CFunction
	public static native boolean NSIsEmptyRect(@ByValue CGRect aRect);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect NSInsetRect(@ByValue CGRect aRect, double dX,
			double dY);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect NSIntegralRect(@ByValue CGRect aRect);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect NSIntegralRectWithOptions(
			@ByValue CGRect aRect, long opts);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect NSUnionRect(@ByValue CGRect aRect,
			@ByValue CGRect bRect);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect NSIntersectionRect(@ByValue CGRect aRect,
			@ByValue CGRect bRect);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect NSOffsetRect(@ByValue CGRect aRect, double dX,
			double dY);

	@Generated
	@CFunction
	public static native void NSDivideRect(
			@ByValue CGRect inRect,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect slice,
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect rem,
			double amount, long edge);

	@Generated
	@CFunction
	public static native boolean NSPointInRect(@ByValue CGPoint aPoint,
			@ByValue CGRect aRect);

	@Generated
	@CFunction
	public static native boolean NSMouseInRect(@ByValue CGPoint aPoint,
			@ByValue CGRect aRect, boolean flipped);

	@Generated
	@CFunction
	public static native boolean NSContainsRect(@ByValue CGRect aRect,
			@ByValue CGRect bRect);

	@Generated
	@CFunction
	public static native boolean NSIntersectsRect(@ByValue CGRect aRect,
			@ByValue CGRect bRect);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromPoint(@ByValue CGPoint aPoint);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromSize(@ByValue CGSize aSize);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromRect(@ByValue CGRect aRect);

	@Generated
	@CFunction
	@ByValue
	public static native CGPoint NSPointFromString(
			@Mapped(ObjCStringMapper.class) String aString);

	@Generated
	@CFunction
	@ByValue
	public static native CGSize NSSizeFromString(
			@Mapped(ObjCStringMapper.class) String aString);

	@Generated
	@CFunction
	@ByValue
	public static native CGRect NSRectFromString(
			@Mapped(ObjCStringMapper.class) String aString);

	@Generated
	@CFunction
	public static native void NSFreeMapTable(NSMapTable table);

	@Generated
	@CFunction
	public static native void NSResetMapTable(NSMapTable table);

	@Generated
	@CFunction
	public static native boolean NSCompareMapTables(NSMapTable table1,
			NSMapTable table2);

	@Generated
	@CFunction
	public static native NSMapTable NSCopyMapTableWithZone(NSMapTable table,
			VoidPtr zone);

	@Generated
	@CFunction
	public static native boolean NSMapMember(NSMapTable table,
			ConstVoidPtr key, Ptr<VoidPtr> originalKey, Ptr<VoidPtr> value);

	@Generated
	@CFunction
	public static native VoidPtr NSMapGet(NSMapTable table, ConstVoidPtr key);

	@Generated
	@CFunction
	public static native void NSMapInsert(NSMapTable table, ConstVoidPtr key,
			ConstVoidPtr value);

	@Generated
	@CFunction
	public static native void NSMapInsertKnownAbsent(NSMapTable table,
			ConstVoidPtr key, ConstVoidPtr value);

	@Generated
	@CFunction
	public static native VoidPtr NSMapInsertIfAbsent(NSMapTable table,
			ConstVoidPtr key, ConstVoidPtr value);

	@Generated
	@CFunction
	public static native void NSMapRemove(NSMapTable table, ConstVoidPtr key);

	@Generated
	@CFunction
	@ByValue
	public static native NSMapEnumerator NSEnumerateMapTable(NSMapTable table);

	@Generated
	@CFunction
	public static native boolean NSNextMapEnumeratorPair(
			@UncertainArgument("Options: reference, array Fallback: reference") NSMapEnumerator enumerator,
			Ptr<VoidPtr> key, Ptr<VoidPtr> value);

	@Generated
	@CFunction
	public static native void NSEndMapTableEnumeration(
			@UncertainArgument("Options: reference, array Fallback: reference") NSMapEnumerator enumerator);

	@Generated
	@CFunction
	public static native long NSCountMapTable(NSMapTable table);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringFromMapTable(NSMapTable table);

	@Generated
	@CFunction
	public static native NSArray NSAllMapTableKeys(NSMapTable table);

	@Generated
	@CFunction
	public static native NSArray NSAllMapTableValues(NSMapTable table);

	@Generated
	@CFunction
	public static native NSMapTable NSCreateMapTableWithZone(
			@ByValue NSMapTableKeyCallBacks keyCallBacks,
			@ByValue NSMapTableValueCallBacks valueCallBacks, long capacity,
			VoidPtr zone);

	@Generated
	@CFunction
	public static native NSMapTable NSCreateMapTable(
			@ByValue NSMapTableKeyCallBacks keyCallBacks,
			@ByValue NSMapTableValueCallBacks valueCallBacks, long capacity);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileTypeForHFSTypeCode(int hfsFileTypeCode);

	@Generated
	@CFunction
	public static native int NSHFSTypeCodeFromFileType(
			@Mapped(ObjCStringMapper.class) String fileTypeString);

	@Generated
	@CFunction
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHFSTypeOfFile(
			@Mapped(ObjCStringMapper.class) String fullFilePath);

	@Generated
	@CVariable()
	public static native double NSFoundationVersionNumber();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBundleDidLoadNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLoadedClasses();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSystemClockDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalendarIdentifierGregorian();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalendarIdentifierBuddhist();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalendarIdentifierChinese();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalendarIdentifierCoptic();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalendarIdentifierEthiopicAmeteMihret();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalendarIdentifierEthiopicAmeteAlem();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalendarIdentifierHebrew();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalendarIdentifierISO8601();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalendarIdentifierIndian();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalendarIdentifierIslamic();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalendarIdentifierIslamicCivil();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalendarIdentifierJapanese();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalendarIdentifierPersian();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalendarIdentifierRepublicOfChina();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCalendarDayChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSParseErrorException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCharacterConversionException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDecimalNumberExactnessException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDecimalNumberOverflowException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDecimalNumberUnderflowException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDecimalNumberDivideByZeroException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCocoaErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPOSIXErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOSStatusErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMachErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUnderlyingErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocalizedDescriptionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocalizedFailureReasonErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocalizedRecoverySuggestionErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocalizedRecoveryOptionsErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRecoveryAttempterErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHelpAnchorErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStringEncodingErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFilePathErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSGenericException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRangeException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInvalidArgumentException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInternalInconsistencyException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMallocException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSObjectInaccessibleException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSObjectNotAvailableException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDestinationInvalidException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPortTimeoutException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInvalidSendPortException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInvalidReceivePortException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPortSendException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPortReceiveException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOldStyleException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAssertionHandlerKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileHandleOperationException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileHandleReadCompletionNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileHandleReadToEndOfFileCompletionNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileHandleConnectionAcceptedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileHandleDataAvailableNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileHandleNotificationDataItem();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileHandleNotificationFileHandleItem();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileHandleNotificationMonitorModes();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUbiquityIdentityDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileTypeDirectory();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileTypeRegular();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileTypeSymbolicLink();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileTypeSocket();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileTypeCharacterSpecial();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileTypeBlockSpecial();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileTypeUnknown();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileSize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileModificationDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileReferenceCount();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileDeviceIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileOwnerAccountName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileGroupOwnerAccountName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFilePosixPermissions();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileSystemNumber();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileSystemFileNumber();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileExtensionHidden();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileHFSCreatorCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileHFSTypeCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileImmutable();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileAppendOnly();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileCreationDate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileOwnerAccountID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileGroupOwnerAccountID();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileBusy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileProtectionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileProtectionNone();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileProtectionComplete();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileProtectionCompleteUnlessOpen();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileProtectionCompleteUntilFirstUserAuthentication();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileSystemSize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileSystemFreeSize();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileSystemNodes();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFileSystemFreeNodes();

	@Generated
	@CVariable()
	@ByValue
	public static native NSHashTableCallBacks NSIntegerHashCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSHashTableCallBacks NSNonOwnedPointerHashCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSHashTableCallBacks NSNonRetainedObjectHashCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSHashTableCallBacks NSObjectHashCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSHashTableCallBacks NSOwnedObjectIdentityHashCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSHashTableCallBacks NSOwnedPointerHashCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSHashTableCallBacks NSPointerToStructHashCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSHashTableCallBacks NSIntHashCallBacks();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPCookieName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPCookieValue();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPCookieOriginURL();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPCookieVersion();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPCookieDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPCookiePath();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPCookieSecure();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPCookieExpires();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPCookieComment();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPCookieCommentURL();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPCookieDiscard();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPCookieMaximumAge();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPCookiePort();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPCookieManagerAcceptPolicyChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPCookieManagerCookiesChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUndefinedKeyException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAverageKeyValueOperator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCountKeyValueOperator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDistinctUnionOfArraysKeyValueOperator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDistinctUnionOfObjectsKeyValueOperator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDistinctUnionOfSetsKeyValueOperator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMaximumKeyValueOperator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMinimumKeyValueOperator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSumKeyValueOperator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUnionOfArraysKeyValueOperator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUnionOfObjectsKeyValueOperator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUnionOfSetsKeyValueOperator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSKeyValueChangeKindKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSKeyValueChangeNewKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSKeyValueChangeOldKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSKeyValueChangeIndexesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSKeyValueChangeNotificationIsPriorKey();

	@Generated
	@CVariable()
	@ByValue
	public static native CGPoint NSZeroPoint();

	@Generated
	@CVariable()
	@ByValue
	public static native CGSize NSZeroSize();

	@Generated
	@CVariable()
	@ByValue
	public static native CGRect NSZeroRect();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInvalidArchiveOperationException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInvalidUnarchiveOperationException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSKeyedArchiveRootObjectKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCurrentLocaleDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleLanguageCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleCountryCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleScriptCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleVariantCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleExemplarCharacterSet();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleCalendar();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleCollationIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleUsesMetricSystem();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleMeasurementSystem();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleDecimalSeparator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleGroupingSeparator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleCurrencySymbol();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleCurrencyCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleCollatorIdentifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleQuotationBeginDelimiterKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleQuotationEndDelimiterKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleAlternateQuotationBeginDelimiterKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocaleAlternateQuotationEndDelimiterKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSGregorianCalendar();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSBuddhistCalendar();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSChineseCalendar();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHebrewCalendar();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSIslamicCalendar();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSIslamicCivilCalendar();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSJapaneseCalendar();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRepublicOfChinaCalendar();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPersianCalendar();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSIndianCalendar();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSISO8601Calendar();

	@Generated
	@CVariable()
	@ByValue
	public static native NSMapTableKeyCallBacks NSIntegerMapKeyCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSMapTableKeyCallBacks NSNonOwnedPointerMapKeyCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSMapTableKeyCallBacks NSNonOwnedPointerOrNullMapKeyCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSMapTableKeyCallBacks NSNonRetainedObjectMapKeyCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSMapTableKeyCallBacks NSObjectMapKeyCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSMapTableKeyCallBacks NSOwnedPointerMapKeyCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSMapTableKeyCallBacks NSIntMapKeyCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSMapTableValueCallBacks NSIntegerMapValueCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSMapTableValueCallBacks NSNonOwnedPointerMapValueCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSMapTableValueCallBacks NSObjectMapValueCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSMapTableValueCallBacks NSNonRetainedObjectMapValueCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSMapTableValueCallBacks NSOwnedPointerMapValueCallBacks();

	@Generated
	@CVariable()
	@ByValue
	public static native NSMapTableValueCallBacks NSIntMapValueCallBacks();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInvocationOperationVoidResultException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInvocationOperationCancelledException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPortDidBecomeInvalidNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingJobTitleKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingOrganizationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingStreetKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingCityKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingStateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingZIPKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingCountryKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingPhoneKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingAirlineKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTextCheckingFlightKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDefaultRunLoopMode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRunLoopCommonModes();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSocketSecurityLevelKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSocketSecurityLevelNone();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSocketSecurityLevelSSLv2();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSocketSecurityLevelSSLv3();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSocketSecurityLevelTLSv1();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSocketSecurityLevelNegotiatedSSL();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSOCKSProxyConfigurationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSOCKSProxyHostKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSOCKSProxyPortKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSOCKSProxyVersionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSOCKSProxyUserKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSOCKSProxyPasswordKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSOCKSProxyVersion4();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSOCKSProxyVersion5();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamDataWrittenToMemoryStreamKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamFileCurrentOffsetKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSocketSSLErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamSOCKSErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamNetworkServiceType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamNetworkServiceTypeVoIP();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamNetworkServiceTypeVideo();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamNetworkServiceTypeBackground();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSStreamNetworkServiceTypeVoice();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWillBecomeMultiThreadedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDidBecomeSingleThreadedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSThreadWillExitNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSSystemTimeZoneDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPPropertyStatusCodeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPPropertyStatusReasonKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPPropertyServerHTTPVersionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPPropertyRedirectionHeadersKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPPropertyErrorPageDataKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHTTPPropertyHTTPProxy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFTPPropertyUserLoginKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFTPPropertyUserPasswordKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFTPPropertyActiveTransferModeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFTPPropertyFileOffsetKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFTPPropertyFTPProxy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLFileScheme();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLKeysOfUnsetValuesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLLocalizedNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLIsRegularFileKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLIsDirectoryKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLIsSymbolicLinkKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLIsVolumeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLIsPackageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLIsSystemImmutableKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLIsUserImmutableKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLIsHiddenKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLHasHiddenExtensionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLCreationDateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLContentAccessDateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLContentModificationDateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLAttributeModificationDateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLLinkCountKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLParentDirectoryURLKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeURLKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLTypeIdentifierKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLLocalizedTypeDescriptionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLLabelNumberKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLLabelColorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLLocalizedLabelKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLEffectiveIconKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLCustomIconKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLFileResourceIdentifierKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeIdentifierKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLPreferredIOBlockSizeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLIsReadableKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLIsWritableKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLIsExecutableKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLFileSecurityKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLIsExcludedFromBackupKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLTagNamesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLPathKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLIsMountTriggerKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLFileResourceTypeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLFileResourceTypeNamedPipe();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLFileResourceTypeCharacterSpecial();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLFileResourceTypeDirectory();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLFileResourceTypeBlockSpecial();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLFileResourceTypeRegular();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLFileResourceTypeSymbolicLink();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLFileResourceTypeSocket();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLFileResourceTypeUnknown();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLFileSizeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLFileAllocatedSizeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLTotalFileSizeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLTotalFileAllocatedSizeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLIsAliasFileKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeLocalizedFormatDescriptionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeTotalCapacityKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeAvailableCapacityKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeResourceCountKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeSupportsPersistentIDsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeSupportsSymbolicLinksKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeSupportsHardLinksKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeSupportsJournalingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeIsJournalingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeSupportsSparseFilesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeSupportsZeroRunsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeSupportsCaseSensitiveNamesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeSupportsCasePreservedNamesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeSupportsRootDirectoryDatesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeSupportsVolumeSizesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeSupportsRenamingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeSupportsAdvisoryFileLockingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeSupportsExtendedSecurityKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeIsBrowsableKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeMaximumFileSizeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeIsEjectableKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeIsRemovableKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeIsInternalKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeIsAutomountedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeIsLocalKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeIsReadOnlyKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeCreationDateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeURLForRemountingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeUUIDStringKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLVolumeLocalizedNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLIsUbiquitousItemKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLUbiquitousItemHasUnresolvedConflictsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLUbiquitousItemIsDownloadedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLUbiquitousItemIsDownloadingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLUbiquitousItemIsUploadedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLUbiquitousItemIsUploadingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLUbiquitousItemPercentDownloadedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLUbiquitousItemPercentUploadedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLUbiquitousItemDownloadingStatusKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLUbiquitousItemDownloadingErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLUbiquitousItemUploadingErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLUbiquitousItemDownloadingStatusNotDownloaded();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLUbiquitousItemDownloadingStatusDownloaded();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLUbiquitousItemDownloadingStatusCurrent();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLCredentialStorageChangedNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLCredentialStorageRemoveSynchronizableCredentials();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLErrorFailingURLErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLErrorFailingURLStringErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSErrorFailingURLStringKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLErrorFailingURLPeerTrustErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLErrorBackgroundTaskCancelledReasonKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLProtectionSpaceHTTP();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLProtectionSpaceHTTPS();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLProtectionSpaceFTP();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLProtectionSpaceHTTPProxy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLProtectionSpaceHTTPSProxy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLProtectionSpaceFTPProxy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLProtectionSpaceSOCKSProxy();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLAuthenticationMethodDefault();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLAuthenticationMethodHTTPBasic();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLAuthenticationMethodHTTPDigest();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLAuthenticationMethodHTMLForm();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLAuthenticationMethodNTLM();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLAuthenticationMethodNegotiate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLAuthenticationMethodClientCertificate();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLAuthenticationMethodServerTrust();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSGlobalDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSArgumentDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSRegistrationDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUserDefaultsDidChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSWeekDayNameArray();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSShortWeekDayNameArray();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMonthNameArray();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSShortMonthNameArray();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTimeFormatString();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDateFormatString();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTimeDateFormatString();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSShortTimeDateFormatString();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSCurrencySymbol();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDecimalSeparator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSThousandsSeparator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDecimalDigits();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAMPMDesignation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSHourNameDesignations();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSYearMonthWeekDesignations();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSEarlierTimeDesignations();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLaterTimeDesignations();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSThisDayDesignations();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSNextDayDesignations();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSNextNextDayDesignations();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPriorDayDesignations();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSDateTimeOrdering();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInternationalCurrencyString();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSShortDateFormatString();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSPositiveCurrencyFormatString();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSNegativeCurrencyFormatString();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSNegateBooleanTransformerName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSIsNilTransformerName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSIsNotNilTransformerName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUnarchiveFromDataTransformerName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSKeyedUnarchiveFromDataTransformerName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSXMLParserErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagSchemeTokenType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagSchemeLexicalClass();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagSchemeNameType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagSchemeNameTypeOrLexicalClass();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagSchemeLemma();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagSchemeLanguage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagSchemeScript();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagWord();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagPunctuation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagWhitespace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagOther();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagNoun();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagVerb();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagAdjective();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagAdverb();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagPronoun();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagDeterminer();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagParticle();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagPreposition();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagNumber();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagConjunction();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagInterjection();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagClassifier();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagIdiom();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagOtherWord();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagSentenceTerminator();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagOpenQuote();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagCloseQuote();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagOpenParenthesis();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagCloseParenthesis();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagWordJoiner();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagDash();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagOtherPunctuation();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagParagraphBreak();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagOtherWhitespace();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagPersonalName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagPlaceName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLinguisticTagOrganizationName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemFSNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemDisplayNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemURLKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemPathKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemFSSizeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemFSCreationDateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemFSContentChangeDateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemIsUbiquitousKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataUbiquitousItemHasUnresolvedConflictsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataUbiquitousItemIsDownloadedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataUbiquitousItemDownloadingStatusKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataUbiquitousItemDownloadingStatusNotDownloaded();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataUbiquitousItemDownloadingStatusDownloaded();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataUbiquitousItemDownloadingStatusCurrent();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataUbiquitousItemIsDownloadingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataUbiquitousItemIsUploadedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataUbiquitousItemIsUploadingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataUbiquitousItemPercentDownloadedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataUbiquitousItemPercentUploadedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataUbiquitousItemDownloadingErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataUbiquitousItemUploadingErrorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAttributeChangeDateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemContentTypeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemContentTypeTreeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemKeywordsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemTitleKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAuthorsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemEditorsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemParticipantsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemProjectsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemDownloadedDateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemWhereFromsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemCommentKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemCopyrightKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemLastUsedDateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemContentCreationDateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemContentModificationDateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemDateAddedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemDurationSecondsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemContactKeywordsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemVersionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemPixelHeightKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemPixelWidthKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemPixelCountKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemColorSpaceKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemBitsPerSampleKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemFlashOnOffKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemFocalLengthKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAcquisitionMakeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAcquisitionModelKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemISOSpeedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemOrientationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemLayerNamesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemWhiteBalanceKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemApertureKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemProfileNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemResolutionWidthDPIKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemResolutionHeightDPIKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemExposureModeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemExposureTimeSecondsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemEXIFVersionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemCameraOwnerKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemFocalLength35mmKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemLensModelKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemEXIFGPSVersionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAltitudeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemLatitudeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemLongitudeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemSpeedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemTimestampKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemGPSTrackKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemImageDirectionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemNamedLocationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemGPSStatusKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemGPSMeasureModeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemGPSDOPKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemGPSMapDatumKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemGPSDestLatitudeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemGPSDestLongitudeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemGPSDestBearingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemGPSDestDistanceKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemGPSProcessingMethodKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemGPSAreaInformationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemGPSDateStampKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemGPSDifferentalKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemCodecsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemMediaTypesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemStreamableKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemTotalBitRateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemVideoBitRateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAudioBitRateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemDeliveryTypeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAlbumKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemHasAlphaChannelKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemRedEyeOnOffKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemMeteringModeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemMaxApertureKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemFNumberKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemExposureProgramKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemExposureTimeStringKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemHeadlineKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemInstructionsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemCityKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemStateOrProvinceKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemCountryKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemTextContentKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAudioSampleRateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAudioChannelCountKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemTempoKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemKeySignatureKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemTimeSignatureKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAudioEncodingApplicationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemComposerKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemLyricistKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAudioTrackNumberKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemRecordingDateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemMusicalGenreKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemIsGeneralMIDISequenceKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemRecordingYearKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemOrganizationsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemLanguagesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemRightsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemPublishersKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemContributorsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemCoverageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemSubjectKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemThemeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemDescriptionKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemIdentifierKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAudiencesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemNumberOfPagesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemPageWidthKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemPageHeightKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemSecurityMethodKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemCreatorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemEncodingApplicationsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemDueDateKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemStarRatingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemPhoneNumbersKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemEmailAddressesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemInstantMessageAddressesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemKindKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemRecipientsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemFinderCommentKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemFontsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAppleLoopsRootKeyKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAppleLoopsKeyFilterTypeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAppleLoopsLoopModeKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAppleLoopDescriptorsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemMusicalInstrumentCategoryKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemMusicalInstrumentNameKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemCFBundleIdentifierKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemInformationKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemDirectorKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemProducerKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemGenreKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemPerformersKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemOriginalFormatKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemOriginalSourceKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAuthorEmailAddressesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemRecipientEmailAddressesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemAuthorAddressesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemRecipientAddressesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemIsLikelyJunkKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemExecutableArchitecturesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemExecutablePlatformKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemApplicationCategoriesKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataItemIsApplicationManagedKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataQueryDidStartGatheringNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataQueryGatheringProgressNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataQueryDidFinishGatheringNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataQueryDidUpdateNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataQueryUpdateAddedItemsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataQueryUpdateChangedItemsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataQueryUpdateRemovedItemsKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataQueryResultContentRelevanceAttribute();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataQueryUserHomeScope();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataQueryLocalComputerScope();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataQueryNetworkScope();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataQueryIndexedLocalComputerScope();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataQueryIndexedNetworkScope();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataQueryUbiquitousDocumentsScope();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSMetadataQueryUbiquitousDataScope();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSNetServicesErrorCode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSNetServicesErrorDomain();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSProgressEstimatedTimeRemainingKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSProgressThroughputKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSProgressKindFile();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSProgressFileOperationKindKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSProgressFileOperationKindDownloading();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSProgressFileOperationKindDecompressingAfterDownloading();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSProgressFileOperationKindReceiving();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSProgressFileOperationKindCopying();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSProgressFileURLKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSProgressFileTotalCountKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSProgressFileCompletedCountKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSProgressFileAnimationImageKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSProgressFileAnimationImageOriginalRectKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSProgressFileIconKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUbiquitousKeyValueStoreDidChangeExternallyNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUbiquitousKeyValueStoreChangeReasonKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUbiquitousKeyValueStoreChangedKeysKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUndoManagerGroupIsDiscardableKey();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUndoManagerCheckpointNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUndoManagerWillUndoChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUndoManagerWillRedoChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUndoManagerDidUndoChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUndoManagerDidRedoChangeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUndoManagerDidOpenUndoGroupNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUndoManagerWillCloseUndoGroupNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUndoManagerDidCloseUndoGroupNotification();

	@Generated
	@CVariable()
	public static native long NSURLSessionTransferSizeUnknown();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSURLSessionDownloadTaskResumeData();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSInconsistentArchiveException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSConnectionReplyMode();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSConnectionDidDieNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSFailedAuthenticationException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSConnectionDidInitializeNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSLocalNotificationCenterType();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSTaskDidTerminateNotification();

	@Generated
	@CVariable()
	public static native double NSAppleEventTimeOutDefault();

	@Generated
	@CVariable()
	public static native double NSAppleEventTimeOutNone();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAppleEventManagerWillProcessFirstEventNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAppleScriptErrorMessage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAppleScriptErrorNumber();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAppleScriptErrorAppName();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAppleScriptErrorBriefMessage();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSAppleScriptErrorRange();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSClassDescriptionNeededForClassNotification();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSOperationNotSupportedForKeyException();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSGrammarRange();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSGrammarUserDescription();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSGrammarCorrections();

	@Generated
	@CVariable()
	@MappedReturn(ObjCStringMapper.class)
	public static native String NSUserNotificationDefaultSoundName();
}
