/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.scenekit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.spritekit.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/SCNAnimatable/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "animationKeys")
    NSArray<NSString> getAnimationKeys();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "addAnimation:forKey:")
    void addAnimation(SCNAnimation animation, String key);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "addAnimationPlayer:forKey:")
    void addAnimationPlayer(SCNAnimationPlayer player, String key);
    @Method(selector = "removeAllAnimations")
    void removeAllAnimations();
    @Method(selector = "removeAnimationForKey:")
    void removeAnimation(String key);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "animationPlayerForKey:")
    SCNAnimationPlayer animationPlayerForKey(String key);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "removeAnimationForKey:blendOutDuration:")
    void removeAnimationForKey(String key, @MachineSizedFloat double duration);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "removeAnimationForKey:fadeOutDuration:")
    void removeAnimation(String key, @MachineSizedFloat double duration);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "animationForKey:")
    CAAnimation getAnimation(String key);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "pauseAnimationForKey:")
    void pauseAnimation(String key);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "resumeAnimationForKey:")
    void resumeAnimation(String key);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "setSpeed:forAnimationKey:")
    void setSpeed(@MachineSizedFloat double speed, String key);
    /**
     * @since Available in iOS 8.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "isAnimationForKeyPaused:")
    boolean isAnimationPaused(String key);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
