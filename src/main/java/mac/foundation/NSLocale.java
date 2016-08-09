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

package mac.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSSecureCoding;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSLocale extends NSObject implements NSCopying, NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSLocale(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("ISOCountryCodes")
	public static native NSArray ISOCountryCodes();

	@Generated
	@Selector("ISOCurrencyCodes")
	public static native NSArray ISOCurrencyCodes();

	@Generated
	@Selector("ISOLanguageCodes")
	public static native NSArray ISOLanguageCodes();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSLocale alloc();

	@Generated
	@Selector("autoupdatingCurrentLocale")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object autoupdatingCurrentLocale();

	@Generated
	@Selector("availableLocaleIdentifiers")
	public static native NSArray availableLocaleIdentifiers();

	@Generated
	@Selector("canonicalLanguageIdentifierFromString:")
	public static native String canonicalLanguageIdentifierFromString(
			String string);

	@Generated
	@Selector("canonicalLocaleIdentifierFromString:")
	public static native String canonicalLocaleIdentifierFromString(
			String string);

	@Generated
	@Selector("characterDirectionForLanguage:")
	public static native long characterDirectionForLanguage(String isoLangCode);

	@Generated
	@Selector("commonISOCurrencyCodes")
	public static native NSArray commonISOCurrencyCodes();

	@Generated
	@Selector("componentsFromLocaleIdentifier:")
	public static native NSDictionary componentsFromLocaleIdentifier(
			String string);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("currentLocale")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object currentLocale();

	@Generated
	@Selector("displayNameForKey:value:")
	public native String displayNameForKeyValue(
			@Mapped(ObjCObjectMapper.class) Object key,
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSLocale init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithLocaleIdentifier:")
	public native NSLocale initWithLocaleIdentifier(String string);

	@Generated
	@Selector("lineDirectionForLanguage:")
	public static native long lineDirectionForLanguage(String isoLangCode);

	@Generated
	@Selector("localeIdentifier")
	public native String localeIdentifier();

	@Generated
	@Selector("localeIdentifierFromComponents:")
	public static native String localeIdentifierFromComponents(NSDictionary dict);

	@Generated
	@Selector("localeIdentifierFromWindowsLocaleCode:")
	public static native String localeIdentifierFromWindowsLocaleCode(int lcid);

	@Generated
	@Selector("localeWithLocaleIdentifier:")
	public static native NSLocale localeWithLocaleIdentifier(String ident);

	@Generated
	@Selector("objectForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectForKey(@Mapped(ObjCObjectMapper.class) Object key);

	@Generated
	@Selector("preferredLanguages")
	public static native NSArray preferredLanguages();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("systemLocale")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object systemLocale();

	@Generated
	@Selector("windowsLocaleCodeFromLocaleIdentifier:")
	public static native int windowsLocaleCodeFromLocaleIdentifier(
			String localeIdentifier);
}
