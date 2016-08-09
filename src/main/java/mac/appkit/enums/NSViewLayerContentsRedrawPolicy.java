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

package mac.appkit.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class NSViewLayerContentsRedrawPolicy {
	@Generated
	private NSViewLayerContentsRedrawPolicy() {
	}

	@Generated
	public static final long Never = 0x0000000000000000L;
	@Generated
	public static final long OnSetNeedsDisplay = 0x0000000000000001L;
	@Generated
	public static final long DuringViewResize = 0x0000000000000002L;
	@Generated
	public static final long BeforeViewResize = 0x0000000000000003L;
	@Generated
	public static final long Crossfade = 0x0000000000000004L;
}
