/*******************************************************************************
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/

package com.liferay.ide.ui.tests;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;

/**
 * @author Terry Jia
 * @auther Ashley Yuan
 */
public class ButtonUtil extends SWTBotUtil
{

    public ButtonUtil( SWTWorkbenchBot bot )
    {
        super( bot );
    }

    public void click( String buttonLabel )
    {
        bot.button( buttonLabel ).click();
        sleep();
    }

    public boolean isEnabled( int index )
    {
        return bot.button( index ).isEnabled();
    }

    public boolean isEnabled( String buttonLabel )
    {
        return bot.button( buttonLabel ).isEnabled();
    }

    public boolean isTooltipEnabled( String tooltip )
    {
        return bot.toolbarButtonWithTooltip( tooltip ).isEnabled();
    }

}