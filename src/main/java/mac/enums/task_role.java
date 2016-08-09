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

package mac.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class task_role {
	@Generated
	private task_role() {
	}

	@Generated
	public static final int TASK_RENICED = 0xFFFFFFFF;
	@Generated
	public static final int TASK_UNSPECIFIED = 0x00000000;
	@Generated
	public static final int TASK_FOREGROUND_APPLICATION = 0x00000001;
	@Generated
	public static final int TASK_BACKGROUND_APPLICATION = 0x00000002;
	@Generated
	public static final int TASK_CONTROL_APPLICATION = 0x00000003;
	@Generated
	public static final int TASK_GRAPHICS_SERVER = 0x00000004;
	@Generated
	public static final int TASK_THROTTLE_APPLICATION = 0x00000005;
	@Generated
	public static final int TASK_NONUI_APPLICATION = 0x00000006;
	@Generated
	public static final int TASK_DEFAULT_APPLICATION = 0x00000007;
}
