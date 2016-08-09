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

package mac.coreservices.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import mac.corefoundation.opaque.*;
import mac.coreservices.opaque.CSIdentityAuthorityRef;
import mac.coreservices.opaque.CSIdentityQueryRef;
import mac.coreservices.opaque.CSIdentityRef;
import mac.coreservices.struct.CSIdentityQueryClientContext;
import mac.struct.UnsignedWide;
import mac.struct.wide;

@Generated
@Library("CoreServices")
@Runtime(CRuntime.class)
public final class CoreServices {
	static {
		NatJ.register();
	}

	@Generated
	private CoreServices() {
	}

	@Generated
	@Inline
	@CFunction
	public static native byte UCIsSurrogateHighCharacter(char character);

	@Generated
	@Inline
	@CFunction
	public static native byte UCIsSurrogateLowCharacter(char character);

	@Generated
	@Inline
	@CFunction
	public static native int UCGetUnicodeScalarValueForSurrogatePair(
			char surrogateHigh, char surrogateLow);

	@Generated
	@CFunction
	public static native long S64Max();

	@Generated
	@CFunction
	public static native long S64Min();

	@Generated
	@CFunction
	public static native long S64Add(long left, long right);

	@Generated
	@CFunction
	public static native long S64Subtract(long left, long right);

	@Generated
	@CFunction
	public static native long S64Negate(long value);

	@Generated
	@CFunction
	public static native long S64Multiply(long left, long right);

	@Generated
	@CFunction
	public static native long S64Mod(long dividend, long divisor);

	@Generated
	@CFunction
	public static native long S64Divide(long dividend, long divisor,
			LongPtr remainder);

	@Generated
	@CFunction
	public static native long S64Div(long dividend, long divisor);

	@Generated
	@CFunction
	public static native long S64Set(int value);

	@Generated
	@CFunction
	public static native long S64SetU(int value);

	@Generated
	@CFunction
	public static native int S32Set(long value);

	@Generated
	@CFunction
	public static native byte S64And(long left, long right);

	@Generated
	@CFunction
	public static native byte S64Or(long left, long right);

	@Generated
	@CFunction
	public static native byte S64Eor(long left, long right);

	@Generated
	@CFunction
	public static native byte S64Not(long value);

	@Generated
	@CFunction
	public static native long S64BitwiseAnd(long left, long right);

	@Generated
	@CFunction
	public static native long S64BitwiseOr(long left, long right);

	@Generated
	@CFunction
	public static native long S64BitwiseEor(long left, long right);

	@Generated
	@CFunction
	public static native long S64BitwiseNot(long value);

	@Generated
	@CFunction
	public static native long S64ShiftRight(long value, int shift);

	@Generated
	@CFunction
	public static native long S64ShiftLeft(long value, int shift);

	@Generated
	@CFunction
	public static native long U64Max();

	@Generated
	@CFunction
	public static native long U64Add(long left, long right);

	@Generated
	@CFunction
	public static native long U64Subtract(long left, long right);

	@Generated
	@CFunction
	public static native long U64Multiply(long left, long right);

	@Generated
	@CFunction
	public static native long U64Mod(long dividend, long divisor);

	@Generated
	@CFunction
	public static native long U64Divide(long dividend, long divisor,
			LongPtr remainder);

	@Generated
	@CFunction
	public static native long U64Div(long dividend, long divisor);

	@Generated
	@CFunction
	public static native long U64Set(int value);

	@Generated
	@CFunction
	public static native long U64SetU(int value);

	@Generated
	@CFunction
	public static native int U32SetU(long value);

	@Generated
	@CFunction
	public static native byte U64And(long left, long right);

	@Generated
	@CFunction
	public static native byte U64Or(long left, long right);

	@Generated
	@CFunction
	public static native byte U64Eor(long left, long right);

	@Generated
	@CFunction
	public static native byte U64Not(long value);

	@Generated
	@CFunction
	public static native long U64BitwiseAnd(long left, long right);

	@Generated
	@CFunction
	public static native long U64BitwiseOr(long left, long right);

	@Generated
	@CFunction
	public static native long U64BitwiseEor(long left, long right);

	@Generated
	@CFunction
	public static native long U64BitwiseNot(long value);

	@Generated
	@CFunction
	public static native long U64ShiftRight(long value, int shift);

	@Generated
	@CFunction
	public static native long U64ShiftLeft(long value, int shift);

	@Generated
	@CFunction
	public static native long UInt64ToSInt64(long value);

	@Generated
	@CFunction
	public static native long SInt64ToUInt64(long value);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native wide SInt64ToWide(long s);

	@Generated
	@Inline
	@CFunction
	public static native long WideToSInt64(@ByValue wide w);

	@Generated
	@Inline
	@CFunction
	@ByValue
	public static native UnsignedWide UInt64ToUnsignedWide(long u);

	@Generated
	@Inline
	@CFunction
	public static native long UnsignedWideToUInt64(@ByValue UnsignedWide uw);

	@Generated
	@CFunction
	public static native long CSIdentityAuthorityGetTypeID();

	@Generated
	@CFunction
	public static native CFStringRef CSIdentityAuthorityCopyLocalizedName(
			CSIdentityAuthorityRef authority);

	@Generated
	@CFunction
	public static native long CSIdentityGetTypeID();

	@Generated
	@CFunction
	public static native CSIdentityRef CSIdentityCreateCopy(
			CFAllocatorRef allocator, CSIdentityRef identity);

	@Generated
	@CFunction
	public static native long CSIdentityGetClass(CSIdentityRef identity);

	@Generated
	@CFunction
	public static native CSIdentityAuthorityRef CSIdentityGetAuthority(
			CSIdentityRef identity);

	@Generated
	@CFunction
	public static native CFStringRef CSIdentityGetFullName(
			CSIdentityRef identity);

	@Generated
	@CFunction
	public static native CFStringRef CSIdentityGetPosixName(
			CSIdentityRef identity);

	@Generated
	@CFunction
	public static native CFDataRef CSIdentityCreatePersistentReference(
			CFAllocatorRef allocator, CSIdentityRef identity);

	@Generated
	@CFunction
	public static native long CSIdentityQueryGetTypeID();

	@Generated
	@CFunction
	public static native CSIdentityQueryRef CSIdentityQueryCreateForName(
			CFAllocatorRef allocator, CFStringRef name, long comparisonMethod,
			long identityClass, CSIdentityAuthorityRef authority);

	@Generated
	@CFunction
	public static native CSIdentityQueryRef CSIdentityQueryCreateForPersistentReference(
			CFAllocatorRef allocator, CFDataRef referenceData);

	@Generated
	@CFunction
	public static native CFArrayRef CSIdentityQueryCopyResults(
			CSIdentityQueryRef query);

	@Generated
	@CFunction
	public static native byte CSIdentityQueryExecute(CSIdentityQueryRef query,
			long flags, Ptr<CFErrorRef> error);

	@Generated
	@CFunction
	public static native byte CSIdentityQueryExecuteAsynchronously(
			CSIdentityQueryRef query,
			long flags,
			@UncertainArgument("Options: reference, array Fallback: reference") CSIdentityQueryClientContext clientContext,
			CFRunLoopRef runLoop, CFStringRef runLoopMode);

	@Generated
	@CFunction
	public static native void CSIdentityQueryStop(CSIdentityQueryRef query);

	@Generated
	@CFunction
	public static native CFStringRef UTTypeCreatePreferredIdentifierForTag(
			CFStringRef inTagClass, CFStringRef inTag,
			CFStringRef inConformingToUTI);

	@Generated
	@CFunction
	public static native CFArrayRef UTTypeCreateAllIdentifiersForTag(
			CFStringRef inTagClass, CFStringRef inTag,
			CFStringRef inConformingToUTI);

	@Generated
	@CFunction
	public static native CFStringRef UTTypeCopyPreferredTagWithClass(
			CFStringRef inUTI, CFStringRef inTagClass);

	@Generated
	@CFunction
	public static native byte UTTypeEqual(CFStringRef inUTI1, CFStringRef inUTI2);

	@Generated
	@CFunction
	public static native byte UTTypeConformsTo(CFStringRef inUTI,
			CFStringRef inConformsToUTI);

	@Generated
	@CFunction
	public static native CFStringRef UTTypeCopyDescription(CFStringRef inUTI);

	@Generated
	@CFunction
	public static native CFDictionaryRef UTTypeCopyDeclaration(CFStringRef inUTI);

	@Generated
	@CFunction
	public static native CFURLRef UTTypeCopyDeclaringBundleURL(CFStringRef inUTI);

	@Generated
	@CVariable()
	public static native CFStringRef kCSIdentityErrorDomain();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeItem();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeContent();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeCompositeContent();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeApplication();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeMessage();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeContact();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeArchive();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeDiskImage();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeData();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeDirectory();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeResolvable();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeSymLink();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeMountPoint();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeAliasFile();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeAliasRecord();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeURL();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeFileURL();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeText();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypePlainText();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeUTF8PlainText();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeUTF16ExternalPlainText();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeUTF16PlainText();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeRTF();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeHTML();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeXML();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeSourceCode();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeCSource();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeObjectiveCSource();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeCPlusPlusSource();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeObjectiveCPlusPlusSource();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeCHeader();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeCPlusPlusHeader();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeJavaSource();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypePDF();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeRTFD();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeFlatRTFD();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeTXNTextAndMultimediaData();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeWebArchive();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeImage();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeJPEG();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeJPEG2000();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeTIFF();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypePICT();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeGIF();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypePNG();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeQuickTimeImage();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeAppleICNS();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeBMP();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeICO();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeAudiovisualContent();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeMovie();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeVideo();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeAudio();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeQuickTimeMovie();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeMPEG();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeMPEG4();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeMP3();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeMPEG4Audio();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeAppleProtectedMPEG4Audio();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeFolder();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeVolume();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypePackage();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeBundle();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeFramework();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeApplicationBundle();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeApplicationFile();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeVCard();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeInkText();

	@Generated
	@CVariable()
	public static native CFStringRef kUTExportedTypeDeclarationsKey();

	@Generated
	@CVariable()
	public static native CFStringRef kUTImportedTypeDeclarationsKey();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeIdentifierKey();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeTagSpecificationKey();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeConformsToKey();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeDescriptionKey();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeIconFileKey();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeReferenceURLKey();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTypeVersionKey();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTagClassFilenameExtension();

	@Generated
	@CVariable()
	public static native CFStringRef kUTTagClassMIMEType();
}
