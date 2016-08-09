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

package mac.appkit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import mac.appkit.NSWindow;
import mac.foundation.NSCoder;
import mac.foundation.NSError;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSWindowRestoration")
public interface NSWindowRestoration {
	@Generated
	@Selector("restoreWindowWithIdentifier:state:completionHandler:")
	@ProtocolClassMethod("restoreWindowWithIdentifierStateCompletionHandler")
	public void _restoreWindowWithIdentifierStateCompletionHandler(
			String identifier,
			NSCoder state,
			@ObjCBlock(name = "call_restoreWindowWithIdentifierStateCompletionHandler") Block_restoreWindowWithIdentifierStateCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_restoreWindowWithIdentifierStateCompletionHandler {
		@Generated
		public void call_restoreWindowWithIdentifierStateCompletionHandler(
				NSWindow arg0, NSError arg1);
	}
}
