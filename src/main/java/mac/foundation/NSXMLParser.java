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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSXMLParser extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSXMLParser(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("abortParsing")
	public native void abortParsing();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSXMLParser alloc();

	@Generated
	@Selector("allowedExternalEntityURLs")
	public native NSSet allowedExternalEntityURLs();

	@Generated
	@Selector("columnNumber")
	public native long columnNumber();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("externalEntityResolvingPolicy")
	public native long externalEntityResolvingPolicy();

	@Generated
	@Selector("init")
	public native NSXMLParser init();

	@Generated
	@Selector("initWithContentsOfURL:")
	public native NSXMLParser initWithContentsOfURL(NSURL url);

	@Generated
	@Selector("initWithData:")
	public native NSXMLParser initWithData(NSData data);

	@Generated
	@Selector("initWithStream:")
	public native NSXMLParser initWithStream(NSInputStream stream);

	@Generated
	@Selector("lineNumber")
	public native long lineNumber();

	@Generated
	@Selector("parse")
	public native boolean parse();

	@Generated
	@Selector("parserError")
	public native NSError parserError();

	@Generated
	@Selector("publicID")
	public native String publicID();

	@Generated
	@Selector("setAllowedExternalEntityURLs:")
	public native void setAllowedExternalEntityURLs(NSSet value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setExternalEntityResolvingPolicy:")
	public native void setExternalEntityResolvingPolicy(long value);

	@Generated
	@Selector("setShouldProcessNamespaces:")
	public native void setShouldProcessNamespaces(
			boolean shouldProcessNamespaces);

	@Generated
	@Selector("setShouldReportNamespacePrefixes:")
	public native void setShouldReportNamespacePrefixes(
			boolean shouldReportNamespacePrefixes);

	@Generated
	@Selector("setShouldResolveExternalEntities:")
	public native void setShouldResolveExternalEntities(
			boolean shouldResolveExternalEntities);

	@Generated
	@Selector("shouldProcessNamespaces")
	public native boolean shouldProcessNamespaces();

	@Generated
	@Selector("shouldReportNamespacePrefixes")
	public native boolean shouldReportNamespacePrefixes();

	@Generated
	@Selector("shouldResolveExternalEntities")
	public native boolean shouldResolveExternalEntities();

	@Generated
	@Selector("systemID")
	public native String systemID();
}
