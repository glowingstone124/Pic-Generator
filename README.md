﻿# Pic-Generator

## Fast, Configurable Pic Generator.

使用此api则证明您已阅读并且同意https://next.glowingstone.cn/article/license.md

- Fast, Portable
- Easy to use with XML templates support
- Can replace some keywords with data.
# Creating A config

```XML
<?xml version="1.0" encoding="UTF-8"?>
<config>
    <width>1600</width>
    <height>900</height>
    <titleFontSize>40</titleFontSize>
    <subTitleFontSize>30</subTitleFontSize>
    <textFontSize>25</textFontSize>
    <boldFontSize>35</boldFontSize>
    <defaultOffset>50</defaultOffset>
    <lineSpacing>20</lineSpacing>
    <alignment>LEFT</alignment>
    <font>Jetbrains Mono</font>
</config>
```

# Edit And Create A template

```XML
<?xml version="1.0" encoding="UTF-8"?>
<contents>
    <title>Quantum Original 2 Status Report</title>
    <text>generated at $current</text>
    <boldtext>MSPT</boldtext>
    <text>$mspt</text>
    <boldtext>Online Players</boldtext>
    <text>$onlinecount</text>
</contents>
```
