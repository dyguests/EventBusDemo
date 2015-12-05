#EventBusDemo

This is a sample for EventBus 3.0.

See [greenrobot/EventBus](https://github.com/greenrobot/EventBus)

#Useage

###Step1.Bind lifecycle.

```java

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

```

###Step2.Prepare subscribers.

```java

    @Subscribe
    public void onMsgEvent(MessageEvent msgEvent) {
        mTextView.setText(msgEvent.getMsg());
    }

```

###Step3.Post events.

```java

    //you can call this in anywhere.
    EventBus.getDefault().post(new MessageEvent("Text EventBus." + new Date()));

```

###Point

`MessageEvent` is customed by yourself. 