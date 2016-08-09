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

package mac.foundation.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.NSArray;
import mac.foundation.NSConnection;
import mac.foundation.NSData;
import mac.foundation.NSDistantObjectRequest;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSConnectionDelegate")
public interface NSConnectionDelegate {
	@Generated
	@IsOptional
	@Selector("authenticateComponents:withData:")
	public boolean authenticateComponentsWithData(NSArray components,
			NSData signature);

	@Generated
	@IsOptional
	@Selector("authenticationDataForComponents:")
	public NSData authenticationDataForComponents(NSArray components);

	@Generated
	@IsOptional
	@Selector("connection:handleRequest:")
	public boolean connectionHandleRequest(NSConnection connection,
			NSDistantObjectRequest doreq);

	@Generated
	@IsOptional
	@Selector("connection:shouldMakeNewConnection:")
	public boolean connectionShouldMakeNewConnection(NSConnection ancestor,
			NSConnection conn);

	@Generated
	@IsOptional
	@Selector("createConversationForConnection:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object createConversationForConnection(NSConnection conn);

	@Generated
	@IsOptional
	@Selector("makeNewConnection:sender:")
	public boolean makeNewConnectionSender(NSConnection conn,
			NSConnection ancestor);
}
