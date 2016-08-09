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

package mac.quartzcore.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CAMediaTiming")
public interface CAMediaTiming {
	@Generated
	@Selector("autoreverses")
	public boolean autoreverses();

	@Generated
	@Selector("beginTime")
	public double beginTime();

	@Generated
	@Selector("duration")
	public double duration();

	@Generated
	@Selector("fillMode")
	public String fillMode();

	@Generated
	@Selector("repeatCount")
	public float repeatCount();

	@Generated
	@Selector("repeatDuration")
	public double repeatDuration();

	@Generated
	@Selector("setAutoreverses:")
	public void setAutoreverses(boolean value);

	@Generated
	@Selector("setBeginTime:")
	public void setBeginTime(double value);

	@Generated
	@Selector("setDuration:")
	public void setDuration(double value);

	@Generated
	@Selector("setFillMode:")
	public void setFillMode(String value);

	@Generated
	@Selector("setRepeatCount:")
	public void setRepeatCount(float value);

	@Generated
	@Selector("setRepeatDuration:")
	public void setRepeatDuration(double value);

	@Generated
	@Selector("setSpeed:")
	public void setSpeed(float value);

	@Generated
	@Selector("setTimeOffset:")
	public void setTimeOffset(double value);

	@Generated
	@Selector("speed")
	public float speed();

	@Generated
	@Selector("timeOffset")
	public double timeOffset();
}
